import java.util.*;
public class Main {
    public static int threeFourDouble(int a, int b){
        int Double=1;
        for(int i=1;i<=b;i++){
            //제곱이 잘못들어갔다/매개변수사용하기
            Double*=a;
      
        }
         return Double;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(threeFourDouble(a,b));
    }
}