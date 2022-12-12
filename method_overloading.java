public class method_overloading {
    public static int numAdd(int x,int y){
        return x+y;
    }
    public static double numAdd(double x,double y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println("Integer addition  "+numAdd(2,3));
        System.out.println("Addition of two Double  "+numAdd(2.66,3.42));
    }
}
