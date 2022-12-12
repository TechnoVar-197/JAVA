import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUmber of rows:--");
        int rows = sc.nextInt();
        for (int i= 0; i<= rows-1 ; i++) {
            for (int j=rows-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int i= 0; i<= rows-1 ; i++) {
            for (int j=-1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-2-i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
