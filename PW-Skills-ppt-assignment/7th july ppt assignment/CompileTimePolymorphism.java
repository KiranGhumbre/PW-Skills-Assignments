public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        int sum1 = MathUtils.add(3, 5);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = MathUtils.add(2, 4, 6);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = MathUtils.add(2.5, 4.7);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
