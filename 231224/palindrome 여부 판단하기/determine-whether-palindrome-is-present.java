//palindrome이란 문자열 뒤집었을때 동일한 문자열
//소문자 알파벳은 문자열A/ 문자열 A 소문자 뒤집을때 동일한 문자열 Yes,  No
// StringBuilder st=new StringBuilder(str).reverse(); StringBuilder 새로운문자열을 추가하거나변경하여 기존개체로 추가및 변경, 
//StringBuilder.reverse(); 문자열뒤집기=> 찍었는데 맞았다 그래도 확실하게인식시키기!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        palindrome(A);
    }
    public static void palindrome(String str){
        StringBuilder st=new StringBuilder(str).reverse();
        if(str.equals(st.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}