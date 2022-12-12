public class method {
    public static void hello(){
        System.out.println("Hello world");
    }
    public static int numAdd(int x,int y){
        return x+y;
    }
    public static void main(String [] args){
        //calling method
        hello();
        //passing parameter
        System.out.println(numAdd(2,3));
    }
}
