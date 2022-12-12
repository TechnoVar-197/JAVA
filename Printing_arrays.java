import java.util.*;
public class Printing_arrays {
    public static void main(String[]args){
        //declaration of array
        int[] test ={1,2,3,4,5,6,7,8,9,10};
        String[] cars={"HONDA","AUDI","BMW","BENZ"};
        // Printing arrays
        System.out.println(Arrays.toString(cars));
        for (int i=0;i<test.length;i++){
            System.out.print(test[i]+"\t");
        }
    }
}
