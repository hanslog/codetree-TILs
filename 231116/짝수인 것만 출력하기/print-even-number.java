import java.util.*;
//n의원소중 짝수값만 출력
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int[] array=new int[n];

       for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
       }
        //꼭 for문 모아서 쓰지 않아도 됨 따로 n은 입력 /다른n은 짝수찾기
       for(int j=0;j<n;j++){
        if(array[j]%2==0)
            System.out.print(array[j]+" ");
       }
    }
}