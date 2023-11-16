import java.util.*;
public class Main {

  //0이주어지면 0제외 /주어진정수차례로출력/홀수이면 +3/짝수 /2= 몫출력  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[100];
        int[] arr2=new int[100];

        int point=0;

        int i=0;
        //Scanner .hasNext() boolean조건형 함수 여기서 있으면 true, false로 사용
        while(sc.hasNext()){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                point=i;
                break;
            }
            if(arr[i]%2==0)
                arr2[i]=arr[i]/2;
            else
                arr2[i]=arr[i]+3;
            
            i++;
        }

        //출력
        for(int k=0;k<point;k++){
            System.out.print(arr2[k]+" ");
        }
    }
}