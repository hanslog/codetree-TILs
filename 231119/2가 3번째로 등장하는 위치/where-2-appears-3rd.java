import java.util.*;
public class Main {
    public static void main(String[] args) {
        //2가 3번째로 등장할때 몇번째 위치인지 출력
        //index 를 cnt로 세서 3번째 등장하는 인덱스위치
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int cnt=0;;
        String[] number=new String[array.length];
        for(int i=0;i<array.length;i++){
            number[i]=String.valueOf(array[i]);
           if(array[i]==2){
                cnt++;
                if(cnt==3){
                    System.out.print(Arrays.asList(number).indexOf("2"));
                }
           }
        
        }
    


    }
}