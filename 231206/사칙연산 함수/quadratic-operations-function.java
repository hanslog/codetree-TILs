//작업중!! 배운거 부분적으로 활용해보기
//나중은 전체적으로
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char sline=sc.next().charAt(0);
        int c=sc.nextInt();
        // String[] splitted=split(expression);
        // int sum=0;
        // for(String s:splitted){
        //     sum+=strToNum(s);
        // }
        System.out.println(a+" "+sline+" "+c+" = "+strToNumber(a,c));
       
    }
    public static int strToNumber(int a, int c){
        String[] sline={"*/+-"};
               int number=0;
               
        for(int i=0;i<=sline.length-1;i++){
            if(sline[i].contains("*"))
                number=a*c;
            else if(sline[i].contains("/"))
                number=a/c;
            else if(sline[i].contains("+"))
                number=a+c;
            else if(sline[i].contains("-"))
                number=a-c;
        }
        return number;
    }
  
}