import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inputI = scan.nextInt();
        double inputD = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();

        System.out.println((i + inputI) + "\n" + (d + inputD) + "\n" + (s + inputString));

        scan.close();

    }
}