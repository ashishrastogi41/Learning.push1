import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        System.out.println("Addition: 1  Substraction: 2  Multiplication: 3  Division: 4");
        int n,a,b;
        System.out.println("Enter the number for the required operation");
        n=k.nextInt();
        System.out.println("Enter the 1st input ");
        a=k.nextInt();
        System.out.println("Enter the 2nd input ");
        b=k.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Result is: "+(a+b));
            break;
            case 2:
                    System.out.println("Result is: "+(a-b));
            break;
            case 3:
                System.out.println("Result is: "+(a*b));
                break;
            case 4:
                System.out.println("Result is: "+(a/b));
                break;
            default:
                System.out.println("Wrong input entered please try again");

        }
    }
}