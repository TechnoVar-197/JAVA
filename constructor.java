class cons {
    int num1;
    int num2;
    public cons(){
        num1 = 4;
        num2 = 5;
    }
    public cons(int a,int b){
        num1 = 9;
        num2 = 10;
    }
}
public class constructor {
    public static void main(String [] args){
        cons obj = new cons();
        System.out.println("Number 1:--\t"+obj.num1);
        System.out.println("Number 2:--\t"+obj.num2);
    }
}
