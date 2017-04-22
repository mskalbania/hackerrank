import java.util.Scanner;

public class Solution20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int swaps = 0;

        for (int i = 0; i < arraySize; i++) {

            array[i] = sc.nextInt();

        }

        for (int j = 0; j < arraySize; j++) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int tempi = array[i];
                    int tempii = array[i + 1];

                    array[i] = tempii;
                    array[i + 1] = tempi;

                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");

        for (int i : array) {
            System.out.print(i + "  ");
        }


    }


}
