//n을 두번째 항으로 초기화/첫번째 1로초기화 한후/3번째부터 전전항(2번째)와 전항(1번째)을 더한수반복해서~100이상출력되면 종료
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] array=new int[100];
       array[0]=1;
       array[1]=n;
        int cnt=1;
       
         
        for(int i=1;i<array.length;i++){
            cnt++;
            //출력값 3번째에서 2번째와 1번째수 더하구 배열
            array[cnt]=array[cnt-1]+array[cnt-2];
            if(array[cnt]>100)
                    break;
        }

            //100넘기면 종료
       for(int k=0;k<=cnt;k++){
                System.out.print(array[k]+" ");
        }

    }
}