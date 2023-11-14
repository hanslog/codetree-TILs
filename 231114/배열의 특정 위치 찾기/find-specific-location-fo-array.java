import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int sum=0;
        int sum2=0;
        int cnt=0;
        double avg=0;
        for(int i=0;i<10;i++){
            //배열을 입력값으로 할때 선언해주고 for문아래 넣어주기
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if((i+1)%2==0)
                sum+=arr[i];

            //if뒤 블럭 2개인지 확인하기/확인안하면 작살난다 안맞아!!
            if((i+1)%3==0){
                sum2+=arr[i];
                cnt++;
            }
        }
        avg=(double)sum2/cnt;

        System.out.println(String.format("%d %.1f", sum, avg));
    }
      
}