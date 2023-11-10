import java.util.*;
//넘복잡하게 생각한다 cnt를 이용했으면 쉽게 끝났다
public class Main {
    //10개정수입력, 입력된정수 거꾸로 순서대로출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int[] arr=new int[10];
      int cnt=0;

      for(int i=0;i<10;i++){
        arr[i]=sc.nextInt();
        if(arr[i]==0)
            break;
        cnt++;
      }

      for(int j=cnt-1;j>=0;j--){
            System.out.print(arr[j]+" ");

            }
      
    }
}