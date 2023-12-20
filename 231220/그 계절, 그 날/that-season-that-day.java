// Y년 날짜중 M/D존재하면 첫번째 어떤계절인지 출력
// Spring, Summer, Fall, Winter
// Y해에 M/D가 존재하지 않는다면 -1을 출력
//우라질 윤년 또나왔어 ㅠ.ㅠ
//4의배수, 100, 400 윤년
//나머지는 윤년이 아니다 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Y=sc.nextInt();
        int M=sc.nextInt();
        int D=sc.nextInt();

        season(Y,M,D);
    }

    public static int lastNumber(int Y, int M, int D){
        if(M==2){
            if(Y%4==0 || Y%100==0 || Y%400==0){
                return 29;
            }else{
              return 28;
            }
        }else if(M==4 || M==6 || M==9){
          return 30;
        }else{
          return 31;
        }
       
    }

    public static boolean Choice(int Y, int M, int D){
        if(M<=12 && D<=lastNumber(Y,M,D)){
          return true;
        }else{
          return false;
        }
    }

    public static void season(int Y, int M, int D){
      if(Choice(Y,M,D)){
        if(M>=3 && M<=5){
          System.out.println("Spring");
        }else if(M>=6 && M<=8){
            System.out.println("Summer");
        }else if(M>=9 && M<=11){
          System.out.println("Fall");
        }else if(M<=2 && M==12){
            System.out.println("Winter");
        }
      }else{
        System.out.println(-1);
      }
    }
}