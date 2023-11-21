import java.util.*;
//대문자는 소문자로 소문자는 대문자로
//Character.isUpperCase(arr[i].charAt(0))먼저 걸으면서 바꿔주기 동시에 반대로 바껴야하니까
// int는 index는 돌뿐이다 String length가지고 비교해도 된다 for문 char로 바꿔주지않아도 비교돼 헷갈리지말것
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
                
        String result=input.replaceAll("CodeTree","cODEtREE");
    
        // int length=input.length();
        // input=input.toUpperCase;
        // for(int i=0;i<length;i++){
        //     if(Character.isLetter(input.charAt(0) && input.charAt(4)))
        //         input=input.toLowerCase;
        // }
       System.out.println(result);


    }
  
}