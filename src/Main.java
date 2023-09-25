    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printDigits(345);
        System.out.println();
        printDigitsReverse(345);
        System.out.println();
        printOdd();
    }

    public static void printDigits(int N) {
        if (N > 0) {
            int lastDigit = N % 10;
            int remainingDigits = N / 10;
            printDigits(remainingDigits);
            System.out.print(lastDigit + " ");
        }
    }

    public static void printOdd() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number != 0) {
            System.out.println(number);
            if(scanner.hasNextInt()) {
                scanner.nextInt();
                printOdd();
            }
        }
    }

    public static void printDigitsReverse(int N) {
        if (N > 0) {
            int lastDigit = N % 10;
            System.out.print(lastDigit + " ");
            int remainingDigits = N / 10;
            printDigitsReverse(remainingDigits);
        }
    }
}

