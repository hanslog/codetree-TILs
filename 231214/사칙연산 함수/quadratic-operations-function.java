//작업중!! 배운거 부분적으로 활용해보기
//나중은 전체적으로
// equals.contains 는 String과 list에서 적용됨/ char에서 활용할수 없음!
// String sline={"*/+-"}했어도 우선순위 */가 먼저라 +가 나와도 곱하기로됨 char로 따로따로 작살내기//울산큰바위인가부다 이문제 머이래!!!!
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String sline=sc.next();
        int c=sc.nextInt();

       if(sline.equals("+")){
       
        System.out.println(a+" "+sline+" "+c+" = ");
    
       }  
       else if(sline.equals("-")){
        System.out.print(a+" "+sline+" "+c+" = ");
      
       }
        else if(sline.equals("/")){
        System.out.print(a+" "+sline+" "+c+" = ");
     
       }
        else if(sline.equals("*")){
        System.out.print(a+" "+sline+" "+c+" = ");

       }else if(sline.contains("^")){
        System.out.print("False");
       }
      
       
     strToNumber(a,c, sline);
        
          

    }
    
  
    public static int strToNumber(int a, int c, String s){
        String[] sline={"*^-/"};
               int number=0;

        for(char i=0;i<=sline.length-1;i++){
                 
            if(sline[i].contains("+")){
            
                System.out.println(number=a+c);
                break;
            }else if(sline[i].contains("-")){
     
                System.out.println(number=a-c);
                break;
            }else if(sline[i].contains("/")){
       
                System.out.println(number=a/c);
                break;
            }else if(sline[i].contains("*")){
           
               System.out.println(number=a*c);
               break;
            }else if(sline[i].equals("^")){
               System.out.println("False");
               break;
            }
        }
                 
            return number;
        }
        
}