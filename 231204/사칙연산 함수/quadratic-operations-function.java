//작업중!! 배운거 부분적으로 활용해보기
//나중은 전체적으로
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String o=sc.next();
        int c=sc.nextInt();
        if(!isValid(expression))
            return "False";
        int sum=0;
        for(String s:splitted){
            sum+=strToNum(s);
        }
        System.out.println(String.valueOf(sum));
    }
    public static String[] split(String expression, int a, int c){
        if(a && c && expression.contains("*"))
            expression=a +" * "+c+" = " ;
        List<String> spliited=new ArrayList();
        String s="";
        for(char ch:expression.toCharArray()){
            if(ch != '0' && !s.isEmpty()){
                splitted.add(s);
                s="";
            }
                s+=ch;
        }
        if(!s.isEmpty())
            splitted.add(s)+n;
        }
        return splitted.toArray(String[]::new);
    }
    public static String isValid(String expression,int n, int m){
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        String o = input[1];
        int c = Integer.parseInt(input[2]);
        if(expression.equals("+"))
            return a+" + "+c+" = "+isValid(a,c);
        if(expression.endsWith("-"))
            return false;
        if(expression.endsWith("/"))
            return false;
        
        if(expression.ednsWith(" * "))
            return false;
        return true;
    }

   public static int strToNum(String s){
    int a=sc.nextInt();
    int c=sc.nextInt();
    int n=s.length()-1;
        if(s.startsWith("+"))
            n=a+c;
        else if(s.startsWith("-"))
            n=a-c;
        else if(s.startsWith("*"))
            n=a*c;
        else if(s.startsWith("/"))
            n=a/c;
    return n;
   }
}