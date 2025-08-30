class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}


public class InheritanceDemo{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Rajesh";
        t.age = 40;
        t.subject = "Math";
        t.salary = 45000;

        t.display();
    }
}

