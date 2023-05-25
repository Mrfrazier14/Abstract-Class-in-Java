// This is the first Exmaple of IF Statements works the first method.
class conditional {
 public static void main(String[] args) {
  int x = 10;

  if (x > 4) {
   System.out.println("x is greater than 4");
  }
 }
}

// IF else statement 2nd exmaple this is for if 

class conditional {
    public static void main(String[] args) {
        int x = 1;
        
        if (x > 4) {
            System.out.println("x is greater than 4");
        } 
        else {
            System.out.println("x is less than 4");
        }
    }
}

// IF else IF statement for if the 1st and 2nd ones.

class conditional {
    public static void main(String[] args) {
        int x = 4;

        if (x > 4) {
            System.out.println("x is greater than 4");
        }
        else if (x == 4) {
            System.out.println("x is equal to 4");
        } 
        else {
            System.out.println("x is less than 4");
        }
    }
}

class conditional_exp {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int answer;
        // Using conditional expression 
        answer = (x > y) ? x : y;
        System.out.println("Answer using conditional: " + answer);
        // The above code is equivalent to:
        // Using the if-else method 
        if (x > y) {
            answer = x;
        } else {
            answer = y;
        }
        System.out.println("Answer using if-else: " + answer);
    }
}
class even_odd {
    public static String evenodd(int x) {
        String answer;
        if (x % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
        return answer;
    }
}
