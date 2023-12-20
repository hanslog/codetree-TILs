//두개의 정수 M,D 2021년 날짜중 M월 D일 존재 Yes
// 존재하지 않아 No 
//M,D 받아 존재연부 반환 2021년 2월 28일까지!!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int D=sc.nextInt();
        for(int i=1;i<=20;i++){
            for(int j=1;j<=50;j++){
                if(i==M && j==D)
                    System.out.println("Yes");
                if(i==2 && D>28){
                    System.out.println("No");
                }
            }

        }
    }
}