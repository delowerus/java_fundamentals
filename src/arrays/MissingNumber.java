package arrays;

public class MissingNumber {
    public static int findMissingNumber(int[] numbers, int n) {
        int sm = n * (n + 1) / 2;
        int sum = 0;

        for (int num : numbers) {

            sum += num;
        }
        return sm - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println(findMissingNumber(arr, 10));

    }
}
