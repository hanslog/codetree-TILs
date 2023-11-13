import java.util.*;
public class Main {
    //정수 10개 입력 합,평균출력 / 단 0이 입력되면 거기까지만 0제외한 합,평균출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        int sum=0;
        double avg=0;
        int cnt=0;
        //index맞추기
        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        //0을제외한 합과 평균/짝수가 아니다!!
            if(n[i]==0)
                break;
                sum+=n[i];
                 cnt++;
        }
        //매번도는게아니라 합계하고 그수에서 나눠주는거라 for문밖이 맞다
              avg=(double)sum/cnt;
            //출력할위치가 맞는지 신경써서 위치시키기
             System.out.printf("%d %.1f",sum,avg);      
    }
}