import java.util.Scanner;

public class FactorsofNum {

    public static int factorOfNumber(int n) {
        int count = 0;

        System.out.print("Factors: ");

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {

                // print first factor
                System.out.print(i + " ");
                count++;

                // print second factor if different
                if (i * i != n) {
                    System.out.print((n / i) + " ");
                    count++;
                }
            }
        }
        System.out.println(); // move to next line
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = factorOfNumber(n);
        System.out.println("Count of factors = " + count);
    }
}
// class FactorsofNum {

//     public static void main(String[] args) {

//         // negative number
//         int num = -100;
//         System.out.print("Factors of " + num + " are: ");

//         // Loop runs between -100 to 100 skipping 0
//         for(int i = num; i <= Math.abs(num); ++i) {

//             // we must skip 0 as iteration
//             if(i == 0) {
//                 continue;
//             }
//             else {
//                 if (num % i == 0) {
//                     System.out.print(i + " ");
//                 }
//             }
//         }
//     }
// }
