//10명미만 4과목점수, 평균60점이상 통과, 통과=pass출력/ 통과못하면=fail/ 통과한사람수출력
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int passcnt=0;
 
        double avg=0;
        //n출력
        for(int i=0;i<n;i++){
            //입력값을 배열을 이용하면 깔끔하다
            int[] arr=new int[4];
            int sum=0;
            //4개 출력값배열
            for(int j=0;j<4;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
                avg=(double)sum/4;
                    if(avg>=60){
                        System.out.println("pass");
                        passcnt++;
                    }else{
                    System.out.println("fail");
                    }
         
        }//for문 첫번째 end
           System.out.println(passcnt);
    }  
}