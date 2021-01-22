package arrays;

public class PrintArray {
    public static void main(String[] args) {
        //Create an integer type of array
        int[] numbers = new int[10];

        //insert values
        int j = 1;
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=  j;
            j++;
        }
        //print array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
