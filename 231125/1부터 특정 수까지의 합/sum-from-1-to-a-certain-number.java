import java.util.*;
public class Main {
    //1부터 특정수까지의 합
    public static int add(int n){
        int sum=0;
        int divide=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        //밖에 빼야지 for문과 함께 divide 빙빙 돈다 
        return divide=sum/10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(add(N));
    }
}