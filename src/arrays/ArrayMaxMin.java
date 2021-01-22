package arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 10, 30,20, 11};
        System.out.println(minimum(array));
        System.out.println(maximum(array));
    }
    public static int minimum(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maximum(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }
        return max;
    }

}
