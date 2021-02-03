package arrays;

public class MissNumb {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        //System.out.println(finMissingNum(arr, 10));
        finMissingNum(arr, 10);

    }
    public static int finMissingNum(int[] numbers, int n){
        int s = n*(n+1)/2;
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        return s-sum;
    }
    public void findingMissing(int []numbers, int n){
        int sn = n*(n+1)/2;
        int sum = 0;
        for(int num: numbers){
            sum += num;

        }
        System.out.println(numbers);

    }
}
