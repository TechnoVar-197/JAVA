public class exception {
    static void checkNum(int num) {
        if (num >=100 && num<=1000) {
            throw new ArithmeticException("Access granted");
        }
        else {
            System.out.println("Access Denied ");
        }
    }

    public static void main(String[] args) {
        checkNum(15);
    }
}
