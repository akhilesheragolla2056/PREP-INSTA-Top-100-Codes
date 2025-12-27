import java.util.Scanner;

public class PerfectNu {
    public static boolean perfectNo(int n) {
        if(n<=1) return false;
        int sum = 1;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        return sum == n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(perfectNo(n));
        if(perfectNo(n)){
            System.out.println("Its a perfectNO");
        }else{
            System.out.println("Not  a perfectNo");
        }
    }

}
