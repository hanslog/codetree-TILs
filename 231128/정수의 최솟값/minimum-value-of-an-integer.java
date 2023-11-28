//abc주어지면 최소값출력
import java.util.*;
public class Main {
    public static int min(int a, int b, int c){
        int small=a;
        for(int i=0;i<3;i++){
            //연결성갖기 samll=a 를 b와 비교하고 결판나면 c와 비교하기 
            if(small>b)
                small=b;
            if(small> c)
                small=c;
           
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(min(a,b,c));
    }
}