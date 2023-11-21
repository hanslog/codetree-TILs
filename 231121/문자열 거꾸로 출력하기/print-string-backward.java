import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 거꾸로 뒤집어 출력하다가 END나오면 종료!!!
        //오랜만이야 거꾸로 
        //직접.equals("END") 문자열비교로갈수도있음

        //문자열을 int 숫자로 뒤집어지는게 잘됨//char로 했는데 실패했음 
        Scanner sc=new Scanner(System.in);

             
        for(int i=0;i<10;i++){
            String text=sc.nextLine();
            if(text.equals("END"))
                break;
        
             int texting=text.length();

    //    char[] literal=text.toCharArray();
            for(int k=texting-1;k>=0;k--){
           //     System.out.print(literal[i]);

                    //숫자로할때 각각 낱개로 잡아줘야하나 문자열출력변수에 String 변수 text.charAt()로 해주기
                    //출력변수 texting로 하면 안됨 숫자로 나옴!!!
                   System.out.print(text.charAt(k));
            }
            System.out.println();
        }//for문 첫번째end
    }
}