//boolean을 함수로 이중으로 쓰기
//a와 b이면 a이상 b이하 중 3,6,9중에 하나가 들어가 있거나 그 숫자 자체가 3의배수인 숫자의개수 세기
//String.valudOf(); 객체를 “문자열로 변환”하는 데 사용되는 함수
import java.util.*;
public class Main {
    public static int threedan(int a, int b){
        List<Integer> number=new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9") || i%3==0)
                 number.add(i);
        }
        return number.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(threedan(a, b));
    }
}