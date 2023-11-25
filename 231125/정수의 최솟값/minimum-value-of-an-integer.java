//abc주어지면 최소값출력
import java.util.*;
public class Main {
    public static int min(int a, int b, int c){
        int small=0;
        int smaller=0;
        int smallest=0;
        for(int i=0;i<3;i++){
            if(a <b)
                small=a;
            if(b> c)
                smaller=c;
            if(small <smaller)
                smallest=small;
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(min(a,b,c));
    }
}