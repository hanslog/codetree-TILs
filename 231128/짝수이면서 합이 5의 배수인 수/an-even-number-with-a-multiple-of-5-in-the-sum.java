import java.util.*;
public class Main {
    //boolean 으로 함수만들기-여러가지가있다 그중하나
    //2자리 숫자 n이 주어져 n이 짝수이면서 각자리 숫자합이 5의배수 Yes /아니라면 No출력
    // public static void doublefive(int n){
    //     if((n%2==0) && ((n/10)+(n%10))%5==0)
    //         System.out.println("Yes");
    //     else
    //         System.out.println("No");
    // }
        public static boolean doublefive(int n){
            return n%2==0 && (n/10+(n%10)) % 5==0;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      //  doublefive(n);

        //숫자합이 맞으면 true면 호출받기
        if(doublefive(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}