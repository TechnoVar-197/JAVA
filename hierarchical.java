class uni{
    String name;
    public uni(){
        name ="SRM UNIVERSITY";
    }
}
class ist extends uni{
    String dept ="COLLEGE OF COMPUTING";
    public ist (){
        System.out.println(dept+"is in "+name);
    }
}
class mang extends uni{
    String dep ="COLLEGE OF MANAGEMENT";
    public mang (){
        System.out.println(dep+"is in "+name);
    }
}
public class hierarchical {
    public static void main(String args[]){
        ist obj1 = new ist();
        mang obj2 = new mang();
    }
}
