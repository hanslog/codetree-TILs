//작업중!! 배운거 부분적으로 활용해보기
//나중은 전체적으로
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char sline=sc.next().charAt(0);
        int c=sc.nextInt();
        
        System.out.println(a+" "+sline+" "+c+" = "+strToNumber(a,c));
       
    }
    public static int strToNumber(int a, int c){
        String sline="* / + - ";
        int number=0;
        if(sline.contains("*"))
            number=a*c;
        else if(sline.contains("/"))
            number=a/c;
        else if(sline.contains("+"))
            number=a+c;
        else if(sline.contains("-"))
            number=a-c;
        
        return number;
    }
  
}