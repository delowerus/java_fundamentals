package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void listOperations(List<String> al){
        System.out.println("initial size of al: " + al.size());

        //Add elements to the array list
        al.add("apple");
        al.add("mango");
        al.add("Guava");
        al.add("Banana");
        al.add("Orange");
        al.add("blueberry");
        System.out.println("Size of al after addition: " + al.size());

        //Display the arrayList
        System.out.println("Contents of al: " + al);

        //Remove elements from the array list
        al.remove(0);
        al.remove("blueberry");
        System.out.println("Size after the deletion " + al.size());
    }

    public static void main(String[] args) {
        //Create an arrayList
        List<String> al = new ArrayList<>();
        listOperations(al);
    }

}
