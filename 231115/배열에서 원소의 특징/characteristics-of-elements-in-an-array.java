import java.util.*;
public class Main {
    //10개 원소에서 3의배수 처음등장 바로 앞 원소출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ten=sc.nextLine().split(" ");
        int[] array=new int[ten.length];
        for(int i=0;i<=array.length-1;i++){
            array[i]=Integer.parseInt(ten[i]);
              if(array[i]%3==0){
                 System.out.print(array[i-1]);
                //반복해서 돌기때문에 3의배수 전값만 표시하여 break로 중지해서 빠져나오기
                 break;
              }
        }  
    }
}
