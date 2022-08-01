import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=k.nextInt();
        int case1,case2,case3;
        if(n%2==0)
            System.out.println("The entered input is even");
        else
            System.out.println("The entered input is odd");
        int dup=n;
        for(int i=1;i<=dup/2;i++)
        {
            if(dup%i==0)
                System.out.println("The factors are:"+i+" ");
        }
        int var=4;
        System.out.println("Test while Loop:");
        while(var < 5) {
            System.out.println("Iteration: "+ ++var);
        }
        System.out.println("Test do-while Loop:");
        var=5;
        do {
            System.out.println("Iteration: "+ ++var);
        } while(var < 5);
    }
}
