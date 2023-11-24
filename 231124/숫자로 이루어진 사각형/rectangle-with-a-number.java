import java.util.*;
//정수 N값 주어지면 N*N모양 사각형 함수전달받아 출력
public class Main {
    public static void numberFour(){
         int cnt=1;
        for(int i=1;i<=4;i++){
           
            for(int j=1;j<=4;j++){
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
        numberFour();
            
    
    }
}