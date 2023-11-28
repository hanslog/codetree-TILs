//우라질 윤년 난 윤년이 싫어 싫다구! 이름이 머 이따구야!!
//연도가 4로 나누어떨어지면 윤년 2020/ 2024/ 2028...
//연도가 100으로 나누어 떨어지면 윤년아니다 2100/2200/2300...
//연도가 400으로 나누어 떨어지면 윤년 2000/ 2400/ 2800
//ex) 2000년은 100의배수이나 400으로 나누어 떨어지기때문에 윤년//2021
//주의사항 boolean Onjeon(int y) 함수안에 if /else if/ else return 해주고
//흐름타고 호출받아 true 또는 false로 출력한다
import java.util.*;
public class Main {
    public static boolean Onjeon(int y){
        //4의배수이면서 100의배수지만 400의배수라면 윤년 
        if(y%4==0 && y%100==0 && y%400==0)
            return true;
        //4의배수이면서 100의 배수라면 윤년아니다
        else if(y%4==0 && y%100==0)
            return false;
        //4의배수라면 윤년
        else if(y%4==0)
            return true;
        else    
            return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(Onjeon(y))
            System.out.println("true");
        else    
            System.out.println("false");
    }
}