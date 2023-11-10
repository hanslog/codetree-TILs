import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            //절대까먹지말기 배열은 변수[i] 괄호가 들어간다는것
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.print(sum+" ");
    }
}