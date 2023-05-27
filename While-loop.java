class HelloWorld {
    public static void main(String args[]) {
        int x = 0;
        int y = 0;
        while (x != 4) { // the while loop will run as long as x==4 condition is being met             
            y += x;
            x += 1;
        } 
        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);    
    }
}
