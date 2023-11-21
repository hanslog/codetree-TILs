import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String word=sc.nextLine();
        for(int i=0;i<word.length();i++){
            //큰거에서 작은거가기 됨//여기서 돌아야하니까 charAt(i)
            char ch=word.charAt(i);
            //.isLetter()함수 char값이 문자인지 판단 true,false
            if(Character.isLetter(ch))
                System.out.print(Character.toUpperCase(ch));
        }
    }
}