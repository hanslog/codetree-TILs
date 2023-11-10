import java.util.*;
//1이상 n이하의 소수를 오름차순으로 공백두고 출력
//출력특징 짝수+1/홀수+2
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
 
       for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=1;j<=n;j++){
            //인지사항 n=3,8일때 나누어떨어질때 =>나누어떨이지지않는수(소수)
                if(i%j==0)
                    cnt++;
            }
            if(cnt==2)
            System.out.print(i+" ");
       }
    }
}