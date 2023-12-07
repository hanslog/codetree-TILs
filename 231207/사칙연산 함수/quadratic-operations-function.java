//작업중!! 배운거 부분적으로 활용해보기
//나중은 전체적으로
// equals.contains 는 String과 list에서 적용됨/ char에서 활용할수 없음!
// String sline={"*/+-"}했어도 우선순위 */가 먼저라 +가 나와도 곱하기로됨 char로 따로따로 작살내기
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char sline=sc.next().charAt(0);
        int c=sc.nextInt();
 
        strToNumber(a,c);
       
    }
    public static int strToNumber(int a, int c){
        char[]sline={'+','-','/','*','^'};
               int number=0;

        for(int i=0;i<sline.length-1;i++){
           
            if(sline[i]=='+')
                System.out.println(a+" "+sline[i]+" "+c+" = "+number=a+c);
            else if(sline[i]=='-')
                System.out.println(a+" "+sline[i]+" "+c+" = "+number=a-c);
            else if(sline[i]=='/')
                System.out.println(a+" "+sline[i]+" "+c+" = "+number=a/c);
            else if(sline[i]=='*')
                System.out.println(a+" "+sline[i]+" "+c+" = "+number=a*c);
            else if(sline[i]=='^')
                System.out.println("False");
                
            }
            return strToNumber(a,c);
        }
        
}