import java.util.Scanner;
public class string {
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter your company first name:");
        String name =k.nextLine();
        System.out.println("Company first name: "+name);
        System.out.println("Enter your company last name:");
        String name2 =k.nextLine();
        System.out.println("Company last name: "+name2);
        String name3 =name+" "+name2;
        System.out.println("Company Name is: "+name3);

    }

}
