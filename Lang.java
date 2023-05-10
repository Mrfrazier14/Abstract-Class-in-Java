public class exponent {
    public static void main(String[] args) {
        System.out.println("2 raised to the power 3 is " + Math.pow(2, 3));
        System.out.println("Exponent squared is " + Math.exp(2));
        System.out.println("The square root of 16 is " + Math.sqrt(16));
        System.out.println("The cube root of 27 is " + Math.cbrt(27));
    }
}

public class absolute {
    public static void main(String[] args) {
        System.out.println("Absolute value of -2: " + Math.abs(-2));
        System.out.println("Absolute value of 2: " + Math.abs(2));
    }
}

class log_op {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("x is equal to: " + x);
        System.out.println("y is equal to: " + y);

        System.out.println("x is greater than y");
        System.out.println(x > y);

        System.out.println("x is less than y");
        
        System.out.println(x < y);

        System.out.println("x is greater than or equal to y");
        System.out.println(x >= y);

        System.out.println("y is less than or equal to y");
        System.out.println(y <= y);

        System.out.println("x is equal to y");
        System.out.println(x == y);

        System.out.println("x is not equal to y");
        System.out.println(x != y);
    }
}
// This is the math side of Java
