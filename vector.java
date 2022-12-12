import java.util.*;
public class vector {
        public static void main(String[]args){
            // create ArrayList
            Vector<String> test = new Vector<String>();

            // Add elements to vector
            test.add("roll no");
            test.add("class");
            test.add("name");
            System.out.println("Vector: " + test);
            // Accessing elements from vector
            String i = test.get(1);
            System.out.println("Element at index 1: " + i);

            test.remove(1);
            System.out.println("Vector: " + test);
            test.clear();
            System.out.println("Vector: " + test);
        }
}
