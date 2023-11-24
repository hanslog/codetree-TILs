import java.util.*;
public class Main {
    //GCD(a,b)=GCD(B,r) 최대공약수
    //최대공약수: 입력숫자가 다 나눠지는수/공통인약수중 가장큰수(GCD)
//LCD  a*b/%d  최소공배수
    public static int gcd(int n, int m){
         while(m !=0){
            int remain=n%m;
            //gcd(a,b)=gcd(b,r) =>r=a%b
            n=m;
            m=remain;
         }
         return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int maximum=gcd(n,m);
        System.out.println(maximum);
    }
}