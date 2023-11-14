//10개문자입력/2,5,8번째 입력받은 문자 차례로 출력
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr=new char[10];

        for(int i=0;i<10;i++){
                arr[i]=sc.next().charAt(0);
                
        }
    //char로배열하나씩 받아서 넘길때 index=0부터 시작하므로 값하나씩 작음!!
        System.out.print(arr[1]+" "+arr[4]+" "+arr[7]);
    }
}