import java.util.Scanner;
class array {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store ");
        int n = k.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            array[i] = k.nextInt();
        }
        System.out.println("Array Elements are following:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
