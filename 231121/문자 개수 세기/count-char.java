import java.util.*;
public class Main {
    //소문자 알파벳이 주어지면 앞서 주어진 문자열에 소문자 알파벳이 몇개인지 출력
    public static void main(String[] args) {
            Scanner alpha=new Scanner(System.in);
            String insert=alpha.next();
          
    System.out.println(countChar(insert,'e'));



    }

      public static int countChar(String alpha, char ch){
        int count=1;

        for(int i=0;i<alpha.length();i++){
            if(alpha.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}