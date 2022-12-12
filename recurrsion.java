import java.util.Scanner;
public class recurrsion {
    public static int fibonacci(int x ){
        if (x==0){
            return 0;
        }
        else if (x==1) {
            return 1;
        }
        else {
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of terms for fibonacci series:--");
        int limit = sc.nextInt();
        for(int i=0;i<limit;i++){
            int term=fibonacci(i);
            System.out.print(term+",\t");
        }
    }
}
