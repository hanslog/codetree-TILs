import java.util.*;
public class Main {
    public static void main(String[] args) {
        //첫번째 줄에 길이가 더긴 문자열 길이 공백두고 출력/두단어길이 같다면 same

        Scanner sc=new Scanner(System.in);
//sc.next(); 개행문자 무시하고 문자열 입력받기 vs .nextLine() ****개행문자 포함!!***하고 문자열 입력받기!!\n 포함됨!!
        String n1=sc.next();
        String n2=sc.next();
        if(n1.length()==n2.length())
            System.out.println("same");
        else if(n1.length()<n2.length())
            System.out.println(n2+" "+n2.length());
        else 
            System.out.println(n1+" "+n1.length());
    }
}