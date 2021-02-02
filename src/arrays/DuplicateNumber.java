package arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbs= {4, 3, 6, 8, 9, 12, 43, 6};
        System.out.println(findDuplicateNumb(numbs));
    }

    public static int findDuplicateNumb(int[] numbers){
        int duplicateNumber = 0;

        for(int num: numbers){
            int count = 0;
            for(int numb: numbers){
                if(num == numb){
                    count++;
                }
            }
            if(count>1){
                duplicateNumber = num;
            }
        }
        return duplicateNumber;
    }
}
