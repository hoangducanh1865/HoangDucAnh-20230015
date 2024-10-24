import java.util.Scanner;

public class Bai_5_6 {
    public static void main(String[] args) {
        int numRow, numCol;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of rows: ");
            numRow = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            numCol = scanner.nextInt();

            if (numRow <= 0 || numCol <= 0) {
                System.out.println("Please enter a positive number!");
            } else break;

        }

        int[][] matrix1 = new int[numRow][numCol];
        int[][] matrix2 = new int[numRow][numCol];


        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }


        System.out.print("The result matrix: ");
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println();
        }

    }
}