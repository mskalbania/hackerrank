import java.util.Scanner;

public class Solution26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Date actualDate = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Date expectedDate = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());

        int fine = 0;

        if (actualDate.equals(expectedDate)) {
            System.out.println(0);
        } else if (actualDate.checkIfBefore(expectedDate)) {
            System.out.println(0);
        } else {

            if ((actualDate.getMonth() == expectedDate.getMonth()) && actualDate.getYear() == expectedDate.getYear()) {
                System.out.println(15*(actualDate.getDay() - expectedDate.getDay()));
            }
            else if(actualDate.getYear() == expectedDate.getYear()){
                System.out.println(500*(actualDate.getMonth() - expectedDate.getMonth()));
            }
            else if(actualDate.getYear() > expectedDate.getYear()){
                System.out.println(10000);
            }


        }
    }
}
