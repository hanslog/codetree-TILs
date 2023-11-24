import java.util.*;
public class Main {
    public static void numberdouble(int two, int three){
        for(int i=0;i<two;i++){
            for(int j=0;j<three;j++){
                System.out.print(1*1);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        numberdouble(n,m);
    }
}