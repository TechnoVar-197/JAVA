import java.io.*;
import java.util.Scanner;
public class pattern7 {
    public static void printNums(int n) {
        int i, j,num;
        for(i=0; i<n; i++) {
            num=1;
            for(j=0; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        System.out.println("Enter the number of rows:--");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n);
    }
}
