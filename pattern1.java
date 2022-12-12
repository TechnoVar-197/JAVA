import java.util.Scanner;

public class pattern1 {
    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {// loop for star
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter maximum no of stars:--");
            int limit = sc.nextInt();
            printTriangle(limit);

    }

}
