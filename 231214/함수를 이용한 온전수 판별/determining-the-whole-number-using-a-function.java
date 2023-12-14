// a와 b주어지면 a이상 b이하 개수

//2로 나누어떨어진다/ 일의자리가 5이다/ 3으로 나누어 떨어지고 9로는 나누어 떨어지지 않는수=>반대로 조건걸기 이외수 cnt와 연결하기
// 짝수/ 몫이 5/ 3의배수이나 9의배수는 아니다
//온전수 23, 27, 29
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       number(a,b);

    }
    public static void number(int a, int b){
        int cnt=0;
        for(int i=a;i<=b;i++){
         //   2로 나누어떨어진다/ 일의자리가 5이다/ 3으로 나누어 떨어지고 9로는 나누어 떨어지지 않는수=>반대로 조건걸기
            if(i%2==0)
                continue;
            else if(i%10==5)
                continue;
            else if(i%3==0 && i%9!=0)
               continue;
            else
                cnt++;
        
        }
        System.out.println(cnt);
    }
}