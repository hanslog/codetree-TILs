import java.util.*;
//대문자는 소문자로 소문자는 대문자로
//오랜만이야 .toCharArray(); 이번엔 뿌리뽑자~!!바꾸자~!! Stirng 에서 char[]바꾸는는데 toCharArray()사용 :문자열을 한글자씩 쪼개서 배열에 집어넣어준다
//  중요*** 문자가 대문자인지 먼저 물어봐준다 !! if(Character.isUpperCase(arr[i])) 
//String.valueOf() 객체를 문자열변환!! 너아주 대소문자 내손에 죽는다! 아주 그냥!! 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        char[] arr=input.toCharArray();        
        for(int i=0;i<arr.length;i++){

            if(Character.isUpperCase(arr[i])){
                arr[i]=Character.toLowerCase(arr[i]);
            }
            else{
                arr[i]=Character.toUpperCase(arr[i]);
            }
        }
        input=String.valueOf(arr);
       System.out.println(input);


    }
  
}