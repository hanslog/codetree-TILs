import java.util.*;
public class Main {
    //첫번째줄 모든 문자열의 개수 출력//2줄과 3줄은 홀수 문자열 출력 //0되면 종료
    //맨마지막 for문은 text.lenth가 아니다!! 문자열개수에따른 홀수값 출력이므로 cnt!!
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int cnt=0;
            String[] text=new String[201];
        for(int i=0;i<200;i++){
                text[i]=sc.next();
            
            if(text[i].equals("0")){
                break;
            }
           cnt++;
       
        }
          System.out.println(cnt);
        //j<cnt //j<text.length 가 아니다 XXXX
            for(int j=0;j<cnt;j+=2){
                    System.out.println(text[j]);
                // if(text[j].equals("null"))
                //     break;
            }   
       
    }
}