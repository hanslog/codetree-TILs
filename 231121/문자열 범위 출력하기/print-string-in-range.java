import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        
        for(int i=2;i<10;i++){
            //위치 지점을 나타내기 때문에 .charAt();쓰는게 좋음
            System.out.print(str.charAt(i));
        }
     
    }
}