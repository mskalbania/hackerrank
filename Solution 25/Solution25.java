import java.util.Scanner;

public class Solution25 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int number = scanner.nextInt();
            int divideNumbers = 0;

            for (int j = 1; j <= Math.sqrt(number); j++) {

                if ((number % j) == 0) {
                    divideNumbers++;
                }
            }

            if ((number != 1) && (divideNumbers == 1)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        }

    }
}