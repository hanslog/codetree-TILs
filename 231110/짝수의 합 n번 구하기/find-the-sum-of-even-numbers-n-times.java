import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
  
        for(int i=1;i<=n;i++){
        //두번째 1 10/ 1 20/ 5 30 이 새롭게 초기화되는점을 생각하면
        //sum값이 첫번째 for문안에 들어가서 초기화되는점과 같다
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=0;
            for(int j=a;j<=b;j++){
                if(j%2==0)
                    sum+=j;  
            }
            System.out.println(sum);
           
        }
        
    }

}