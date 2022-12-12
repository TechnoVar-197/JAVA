import java.util.Scanner;

public class classes  {
    public static class cls {
        String name;
        int age;
        String pos;

        public cls(String name, int age, String pos) {
            this.name = name;
            this.age = age;
            this.pos = pos;
        }

        public String getname() {
            return name;
        }

        public int getage() {
            return age;
        }

        public String getpos() {
            return pos;
        }

        public String toString() {
            return (" I am " + this.getname() + " My age is " + this.getage() + " my current position is " + this.getpos());
        }

        public static class books {
            String Bookname;
            String Author;
            int pages;

            //declaration of constructor
            public void getdetails() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Book name:--");
                String bk = sc.nextLine();
                this.Bookname = bk;
                System.out.println("Enter Author name:--");
                String au = sc.nextLine();
                this.Author = au;
                System.out.println("Enter No of pages:--");
                int pg = sc.nextInt();
                this.pages = pg;
            }

            public void display() {
                System.out.println("Bookname:--" + this.Bookname + "\nAuthor Name:--" + this.Author + "\nNumber of pages:--" + this.pages);
            }
        }
    }

    public static void main(String[] args) {
        cls.books temp = new cls.books();
        temp.getdetails();
        temp.display();
        cls test = new cls("Aniruddha", 19, "Hr");
        System.out.println(test.toString());
    }
}
