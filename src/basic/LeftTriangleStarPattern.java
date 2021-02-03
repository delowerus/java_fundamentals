package basic;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        //x for rows, y for columns, and row denotes the numbers of rows to print
        int row = 5;
        //outer loop for rows
        for(int x = 1; x <= row; x++){
            //System.out.println("x: " + x);
            //inner loop for column
            for(int y = 1; y <= x; y++){
                //to print star
                System.out.print( y + " ");
            }
            System.out.println();
        }
    }
}
