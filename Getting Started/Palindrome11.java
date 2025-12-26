// import java.util.*;
// public class Palindrome11No {
//     public static boolean palindromeNo(int n){
//         int dup=n;
//         int rev=0;
//         while(n>0){
//             int lastDigit=n%10;
//             rev=(rev*10)+lastDigit;
//             n=n/10;
//         }
//         return dup==rev;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a no");
//         int n=sc.nextInt();
//         if(palindromeNo(n)){
//             System.out.println("Its a plindrome no");
//         }else{
//             System.out.println("Not a plindrome No");
//         }

//     }

// }
//Plindrome String
import java.util.*;

public class Palindrome11 {
    public static boolean palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (palindrome(str)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
