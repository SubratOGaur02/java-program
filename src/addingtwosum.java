import java.util.Scanner;
public class addingtwosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Two Numbers");
        System.out.println("Enter the no. a: ");
        int a = sc.nextInt();
        System.out.println("Enter the no. b: ");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("The sum is: "+c);

    }
}
