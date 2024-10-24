import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai_5_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int n;
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int sum = 0;
        double average;
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
            sum += arrayList.get(i);
        }
        Collections.sort(arrayList);

        System.out.print("Array after sorting: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        average = 1.0 * sum / n;
        System.out.println("Sum of array: " + sum);
        System.out.println("Average: " + average);

    }
}