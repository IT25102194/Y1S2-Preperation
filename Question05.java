public class Question05 {
    
    public static void main(String[] args) {
        // Expression 1
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("1: " + result1);

        // Expression 2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("2: " + result2);
    }
    
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int square(int a) {
        return a * a;
    }
}
