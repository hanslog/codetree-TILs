import java.util.*;
public class Main {
    //학점 반올림하여 소수첫째자리출력
    //평균학점 등급영어출력 4.0 Perfect/ 3.0  Good/ 3.0미만 Poor
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       double[] arr=new double[100];
       double sum=0;
       double avg=0;

       for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];
            avg=sum/n;
       }
       //소수첫째자리구할때 String.format()활용 or printf("%.1f", avg);
        System.out.println(String.format("%.1f",avg));
            if(avg>=4.0)
                System.out.println("Perfect");
            else if(avg>=3.0)
                System.out.println("Good");
            else if(avg<3.0)
                System.out.println("Poor");
        System.out.println();
       
     
    }
}