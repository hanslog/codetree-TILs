//끊김없이 A에 속한 B가 같다면 Yes/ 끊기면 No
// 끊기지 않고 연속적인 방법
import java.util.*;
public class Main {
        //미리미리 선언할꺼 다해주기
    public static final int MAX=100;
    public static int n1, n2;
    public static int[] a=new int[MAX];
    public static int[] b=new int [MAX];


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //먼저 정수받구
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        for(int i=0;i<n1;i++){
            //n1에대한 배열받기
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            //n2에대한배열받기
            b[i]=sc.nextInt();
        }
        if(Subsequence())
            System.out.print("Yes");
  
        else
            System.out.print("No");
    }


    public static boolean Same(int n){
        //이때 i<n2보다 작아야한다
        for(int i=0;i<n2;i++)
            //a와 b가 같은지 본다
            if(a[i+n] !=b[i])
                return false;
        
        return true;
    }

    //b가 a의 연속부분수열인지 확인하려면 n1-n2
    public static boolean Subsequence(){
        for(int i=0;i<=n1-n2;i++)
            if(Same(i))
                return true;
        return false;
    }
}