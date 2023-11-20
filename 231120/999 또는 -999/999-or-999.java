import java.util.*;
public class Main {
    //100개 세자리이하정수 중 /999번째이전숫자중 가장 큰수와 가장작은수 출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n=new int[100];
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<100;i++){
            n[i]=sc.nextInt();
            if(n[i]==999 || n[i]==-999)
                    break;
            if(min>n[i]){
                min=n[i];
            } 
            if(n[i]>max){
                max=n[i];
            }
        }
        System.out.println(String.format("%d %d",max,min));
    }
}