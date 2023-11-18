import java.util.*;
//주사위 10번던지기/던질때마다 나오는 숫자 개수출력
//1~6까지 나온횟수 출력
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int[] arr=new int[11];//index[]로 표현할때 +1인점 주의하기
    int[] cnt=new int[7];

        for(int i=1;i<=10;i++){
            arr[i]=sc.nextInt();
            //기존입력값에 cnt개수 매기니까 cnt[arr[i]]++로 해주기
            cnt[arr[i]]++;
        }

        for(int i=1;i<=6;i++){
            System.out.println(i+" - "+cnt[i]);
        }

    }
}