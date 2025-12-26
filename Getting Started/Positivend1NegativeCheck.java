import java.util.Scanner;

public class Positivend1NegativeCheck {
    public static void postiveAndNegativeCheck(int n) {

        if (n > 0) {
            System.out.println("It is a positive number");
        } else if (n < 0) {
            System.out.println("It is a negative number");

        } else {
            System.out.println("Zero");
        }

    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n=sc.nextInt();
        postiveAndNegativeCheck(n);

    }

}
