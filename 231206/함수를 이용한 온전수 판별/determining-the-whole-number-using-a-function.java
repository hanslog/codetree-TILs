// a와 b주어지면 a이상 b이하 개수

//2로 나누어떨어진다/ 일의자리가 5이다/ 3으로 나누어 떨어지고 9로는 나누어 떨어지지 않는수=>이조건 모두 만족하지 않는수가 온전수
// 짝수/ 몫이 5/ 3의배수이나 9의배수는 아니다
//온전수 23, 27, 29
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(number(a,b));

    }
    public static int number(int a, int b){
        int cnt=0;
        for(int i=a;i<=b;i++){
            if(!i%2==0 && !i/10==5 && !i%3==0 && i%9==0)
            cnt++;
                System.out.print(cnt);
        }
    }
}