class exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer;
        double sum = Math.pow(x, 2) + Math.pow(y, 2);
        double sub = sum - Math.abs(z);
        answer = Math.cbrt(sub);
        return answer;
    }
}

class exercise {

    public static boolean exercise_two(boolean x, boolean y) {
        boolean answer;
        boolean not_x = !x;
        boolean xor_x = not_x ^ x;
        boolean and_xy = xor_x && y;
        answer = !and_xy;

        return answer;
    }
}
public class HelloYou {
  public static void main(String[] args) { 
    
    
 System.out.println("Hello World"); }
}
