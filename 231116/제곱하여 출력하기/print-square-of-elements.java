import java.util.*;
public class Main {
    //주어진 n개의 원소에 각각 제곱 출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<=array.length-1;i++){
            array[i]=sc.nextInt();
            for(int j=1;j<=10;j++){
                if(array[i]==j)
                ///여기에서 제곱은 2가 아니다 ex)같은 값 8이면 8*8이 제곱이란 말이다 
                    System.out.print(array[i]*j+" ");
               }
            }
        }

}