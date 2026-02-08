class Question04A {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        
        while (rows > 0) {
            while (columns > 0) {
                System.out.print("* ");
                columns = columns - 1;
            }
            System.out.print("\n");
            columns = 5;
            rows = rows - 1;
        }
    }
}
