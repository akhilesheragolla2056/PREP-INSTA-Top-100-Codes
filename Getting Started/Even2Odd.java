import java.util.Scanner;

public class Even2Odd {

    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        evenOdd(n);
        sc.close();
    }
}
