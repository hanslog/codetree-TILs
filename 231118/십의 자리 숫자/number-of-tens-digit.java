import java.util.*;
//주어진 정수중에 0이주어지면 0제외/0이전 입력된정수 /***십의자리 (첫번째숫자)숫자가 작은수부터 몇개인지 출력*** /0이 맨마지막
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[99];
        int[] cnt=new int[10];

        for(int i=0;i<99;i++){
            array[i]=sc.nextInt();
            if(array[i]==0)
                break;
            //두자리수인 십의자리만 비교하니까 1의자리는 무시하는거 넣어야 된다
            if(array[i]<10)
                continue;
            //첫번째 자리인지 알기위해 cnt[array[i]/10]활용 //10은 나누기 0.1
            cnt[array[i]/10]++;
        }

        for(int i=1;i<10;i++){
            System.out.println(String.format("%d - %d",i,cnt[i]));
        }
    }
}