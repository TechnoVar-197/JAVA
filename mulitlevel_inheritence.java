
class state{
    String st;

    public state() {
        String st = "Harayana";
        System.out.println("Inside class state");
    }
}
class city extends state{
    String cit;
    int pin;
    public city(){
        cit ="Faridabad";
        pin=121004;
        System.out.println("Inside class city");
    }
}
class Aniruddha_015 extends city{
    String name;
    String reg;
    public Aniruddha_015(){
        name = "Aniruddha";
        reg = "RA2112704010015";
        System.out.println("Inside class Aniruddha-015");
    }

}
public class mulitlevel_inheritence {
    public static void main(String[]args){
        Aniruddha_015 obj = new Aniruddha_015();
        System.out.println("My name is "+obj.name);
        System.out.println("My Registration number is "+obj.reg);
        System.out.println("I am from  "+obj.cit +"city whose pin code is "+obj.pin);
        System.out.println("I am from  "+obj.st+" State ");
    }
}
