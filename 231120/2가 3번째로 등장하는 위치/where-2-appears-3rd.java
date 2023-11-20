import java.util.*;
public class Main {
    //모르겠다....3시간넘게 고민하는데 안풀린다 힌트는 주는데 돌아버리겠다 
    public static void main(String[] args) {
        //2가 3번째로 등장할때 몇번째 위치인지 출력
        //index 를 cnt로 세서 3번째 등장하는 인덱스위치
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int[] search=new int[n];
        int cnt=0;;
     
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            if(array[i]==2)
                cnt++;
              
            if(cnt==2 && array[i]==){
                System.out.print(array[i]+1);
    
                break;
            }
        }
      

         
    
    }
}
