import java.util.*;
//8명점수, 평균점수,소수 첫째자리
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[100];
        double sum=0;
        double avg=0;
        for(int i=0;i<8;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            avg=sum/8;
        }
        System.out.println(String.format("%.1f", avg));
        
    }
}