import java.util.*;
public class Main {
    public static void main(String[] args) {
        // n과 문자열 A 공백사이에 두고//문자열 A와 일치하는 문자열의 개수구하기
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String input=sc.next();
          
            int cnt=0;
            //위치 <n 인덱스 맞추기 //굳이 밑에 3개 다할필요없었다
            // 결국 비교하면서 맞으면 늘어나는거라 하나가지고 비교해도되었다 복잡하게 생각해서 문제야 허무해!!!!
        for(int i=0;i<n;i++){
         
          String second=sc.next();
           if(input.equals(second))
           cnt++;
        }
        System.out.println(cnt);


    }
}