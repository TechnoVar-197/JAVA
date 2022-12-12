import java.util.ArrayList;
public class Tut1 {
    public static void main(String[]args){
        // create ArrayList
        ArrayList<String> test = new ArrayList<>();

        // Add elements to ArrayList
        test.add("roll no");
        test.add("class");
        test.add("name");
        System.out.println("ArrayList: " + test);
        // Accessing elements from Array List
        String i = test.get(1);
        System.out.println("Elment at index 1: " + i);

        test.remove(1);
        System.out.println("ArrayList: " + test);
        test.clear();
        System.out.println("ArrayList: " + test);
    }
}
