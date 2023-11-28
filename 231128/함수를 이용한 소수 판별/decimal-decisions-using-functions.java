import java.util.*;
public class Main {
    // a와 b 주어지면 a이상 b이하 소수들의 합
    public static boolean Prime(int n){
        	//홀수도아니고
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            //약수도아니고
            if(n%i==0)
                return false;
        }
        //나누어떨어지지않으면 소수맞아
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sosu=0;
        for(int i=a;i<=b;i++){
            if(Prime(i)){
                sosu+=i;
            }
        }
        System.out.print(sosu);
    }
}