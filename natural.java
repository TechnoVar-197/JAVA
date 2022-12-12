import java.util.Scanner;  // Import the Scanner class
public class natural {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of terms :--");
            int sum = 0;
            int limit = sc.nextInt();
            for (int i =1;i<=limit;i++) {
                sum+=i;
            }
            System.out.println("The sum of the series is:--" + sum);
        }
}
