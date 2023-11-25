import java.util.*;
//최소공배수 구하기
public class Main {
//GCD(a,b)=GCD(b,r)=>r=a%b
    public static int gcd(int n, int m){
        if(m==0)
            return n;
        return gcd(m,n%m);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
      
      int maximum=gcd(n,m);
       System.out.println((n*m)/maximum);
    }
}