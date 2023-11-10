import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int cnt=0;
        int count=0;
        for(int i=1;i<=start;i++){
            for(int j=1;j<=end;j++){
                if(j%4==0)
                    cnt++;
                if(cnt==3)
                    count=1;
            }
        }
        System.out.println(count);
    }
}