class concat {
    public static void main(String[] args) {
        String one = "Hello";
        String two = " World";
        int number = 10;

        // concatenating two strings
        System.out.println(one + two);

        //concatenating a number and string
        System.out.println(one + " " + number);

        //saving concatenated string and printing
        String new_string = one + two + " " + number;
        System.out.println(new_string);
    }
}

//Compairing Strings 
class concat {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";
        String lower = "hello";
        String same = "Hello";

        System.out.println(one.equals(two));

        System.out.println(one.equals(lower));

        System.out.println(one.equals(same));
    }
}

//Splitting a strings

class split_string {
    public static void main(String[] args) {
        String greet = "Hello World,My name is Waldo,How are you?";
        String[] greetings = greet.split(",");
        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);
    }
}
