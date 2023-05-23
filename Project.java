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
