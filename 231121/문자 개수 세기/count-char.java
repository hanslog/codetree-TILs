import java.util.*;
public class Main {
    //소문자 알파벳이 주어지면 앞서 주어진 문자열에 소문자 알파벳이 몇개인지 출력
    public static void main(String[] args) {
            Scanner alpha=new Scanner(System.in);
            String insert=alpha.nextLine();
          //e와 a 하나씩 맞춰야 하니까 .next().charAt(0);
            char a=alpha.next().charAt(0);
            int cnt=0;
            for(int i=0;i<insert.length();i++){
                if(insert.charAt(i)==a){
                    cnt++;
                }
            }
            System.out.println(cnt);
    }
}