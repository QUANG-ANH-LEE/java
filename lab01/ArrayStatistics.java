import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];

        // Nhập các phần tử
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(arr);

        // Tính tổng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Tính trung bình
        double average = (double) sum / n;

        // In kết quả
        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + average);

        scanner.close();
    }
}
