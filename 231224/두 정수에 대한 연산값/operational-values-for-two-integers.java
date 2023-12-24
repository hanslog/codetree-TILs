//작은수 2곱하기/큰수 25더하기
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        plusdouble(a,b);
    }
    public static void plusdouble(int a,int b){
        if(a<b){
            System.out.print(a*2+" ");
        }
        if(b>a){
            System.out.print(b+25+" ");
        }
    }
}