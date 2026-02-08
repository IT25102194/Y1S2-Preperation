public class Question03 {
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();

        int number = 7;

        if (obj.findEvenOrOdd(number)) {
            System.out.println(number + " is an Even Number");
        } else {
            System.out.println(number + " is an Odd Number");
        }
    }
}

public class EvenOddNumber {
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}
