import java.util.*;
//100~0 10점단위로 구분하여 /점수대별 - 학생수 출력
//100점대와 10점대 편하게출력하기위해 센스필요 "0- "로 출력에 붙이기=>출력사항 자리수 한자리인거 알면 필요=>단순하게 생각하자!!
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[] array=new int[100];
       int[] cnt=new int[11];
//0부터 99까지로 100으로 맞추기
       for(int i=0;i<100;i++){
            array[i]=sc.nextInt();
            if(array[i]==0)
                break;
               //1의자리 건너뛰기로 0으로 만들기    
             if(array[i]<10)
                 continue;

            cnt[array[i]/10]++;
       }
        //거꾸로 출력되는거 주의깊게보기
        for(int i=10;i>=1;i--){
            System.out.println(i+"0 - "+cnt[i]);
        }

    }
}