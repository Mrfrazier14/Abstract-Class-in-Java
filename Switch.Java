// This is the 1st example of the IF else IF statement but this Construct only uses int, short values, and character constants or character literals.

class switch_statement {
    public static void main(String[] args) {
        int x = 2;
        int temp;

        switch (x) {
            case 1:
                temp = 1;
                break;
            case 2:
                temp = 2;
                break;
            default:
                temp = 3;
                break;
        }
        System.out.println("Value of temp: " + temp);
    }
}

// This is the 2nd part of the Switch Case Example 
class switch_statement {
    public static void main(String[] args) {
        int x = 2;
        int temp;
        switch (x) {

            case 1:
            case 2:
            case 3:
                temp = 0;
                break;
            case 4:
                temp = 4;
                break;
            default:
                temp = 5;
                break;
        }
        System.out.println("Value of temp: " + temp);
    }
}
