public class DataTypeDemo {
    public static void main(String[] args) {


        byte age = 25;
        short distance = 15000;
        int population = 1_380_000_000;
        long worldPopulation = 7_800_000_000L;
        float pi = 3.14f;
        double e = 2.718281828459;
        char initial = 'W';
        boolean isJavaFun = true;

        //  Printing Values
        System.out.println("Age (byte): " + age);
        System.out.println("Distance (short): " + distance);
        System.out.println("Population (int): " + population);
        System.out.println("World Population (long): " + worldPopulation);
        System.out.println("PI (float): " + pi);
        System.out.println("Euler's number (double): " + e);
        System.out.println("Initial (char): " + initial);
        System.out.println("Is Java Fun? (boolean): " + isJavaFun);

        //  Optional Task
        int sum = age + distance;
        boolean result = isJavaFun && (pi < 3.5);
        System.out.println("Sum of age and distance: " + sum);
        System.out.println("Is Java fun and pi < 3.5? " + result);
    }
}
