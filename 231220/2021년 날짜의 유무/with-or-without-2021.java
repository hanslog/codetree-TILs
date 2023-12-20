//두개의 정수 M,D 2021년 날짜중 M월 D일 존재 Yes
// 존재하지 않아 No 
//M,D 받아 존재연부 반환 2021년 2월 28일까지!!
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int D=sc.nextInt();
       boolean calculate=false;
       if(M==4 || M==6 || M==9 || M==11 || M==13){
            calculate=Month30(M, D);    
       }else {
            calculate=Month31(M, D);
       }

       if(calculate){
            System.out.println("Yes");
       }else{
            System.out.println("No");
       }
    }

    public static boolean Month30(int M, int D){
        
                if(D<=28){
                    return true;
                }else{
                    return false;
                }
        
}

    
    public static boolean Month31(int M, int D){
      if(M==2){
        if(D>28){
            return false;
        }else{
            return true;
        }
      }
      if(D<=31){
        return true;
      }else{
        return false;
      }
    }
}