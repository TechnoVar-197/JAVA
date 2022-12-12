import java.util.Scanner;

public class facions {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of terms :--");
            int sum = 0;
            int limit = sc.nextInt();
            for (int i =1;i<=limit;i++) {
                sum+=(1/i);
            }
            System.out.println("The sum of the series is:--" + sum);
        }

}
