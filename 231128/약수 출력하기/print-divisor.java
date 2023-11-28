import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double N=sc.nextInt();
        
        for(int i=0;i<=N;i++){
            if((double)N%i==0)
            System.out.print(i+" ");
        }
    
    }
}