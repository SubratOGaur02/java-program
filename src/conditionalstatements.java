import java.util.Scanner;

// Print "odd" if te in put value is odd, otherwsie print"even".
//Note input value is between 1 and 10^6.
public class conditionalstatements {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = Sc.nextInt();


        if (n%2==1){
            System.out.println("odd number");

        }
        else {
            System.out.println("even number");
        }
    }
}
