import java.util.*;
//정수 N값 주어지면 N*N모양 사각형 함수전달받아 출력
//n을 4로 해줬다구 틀리냐 참나.....//N 입력값있어서 매개변수 n있어야 되고 n값으로 조건값줘야됨 4로 하면안된다
public class Main {
    public static void numberFour(int n){
         int cnt=1;
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=n;j++){
                System.out.print(cnt+" ");
                cnt++;
                if(cnt==10)
                    cnt=1;
            }
           
              System.out.println();
        }
           
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        numberFour(N);
            
    
    }
}