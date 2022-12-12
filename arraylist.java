import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        //Creating arraylist
        list.add("Aniruddha");
        //Adding object in arraylist
        list.add("Abhay");
        list.add("Gaurav");
        list.add("Ayush");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
