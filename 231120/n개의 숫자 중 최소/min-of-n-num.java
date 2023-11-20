import java.util.*;
public class Main {
    // N개의 정수 입력/최소값과 최소값을 갖는 원소의 개수출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int min=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            //min이 최대값으로 클때 cnt=1이되는거 주의하기
                cnt=1;
            }else if(min==array[i])
               cnt++;
        }
         System.out.println(min+" "+cnt);

    }
}