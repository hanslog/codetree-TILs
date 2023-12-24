//작은수 2곱하기/큰수 25더하기
//생성자매개변수와 메서드만든거 활용하기
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        IntNumber aNumber=new IntNumber(a);
        IntNumber bNumber=new IntNumber(b);

        plusdouble(aNumber,bNumber);

        a=aNumber.number;
        b=bNumber.number;

        System.out.print(a+" "+b);
    }
    public static void plusdouble(IntNumber a,IntNumber b){
        if(a.number>b.number){
           b.number*=2;
           a.number+=25;
        }else{
           a.number*=2;
           b.number+=25;
        }
  //     return;
    }
}

class IntNumber{
    int number;

    public IntNumber(int number){
        this.number=number;
    }
}