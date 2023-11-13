import java.util.*;
public class Main {
    //정수 10개 입력 합,평균출력 / 단 0이 입력되면 거기까지만 0제외한 합,평균출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n=new int[10];
        int sum=0;
        double avg=0;
        int cnt=0;
        for(int i=0;i<=10;i++){
            n[i]=sc.nextInt();
            cnt++;
            if(n[i]==0){
                break;
            }else{
                sum+=n[i];
                avg=sum/cnt;
            }
       
        }
            //출력할위치가 맞는지 신경써서 위치시키기
             System.out.println(String.format("%d, %.1f",sum,avg));
    }
}