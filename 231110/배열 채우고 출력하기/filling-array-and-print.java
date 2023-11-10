import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr=new char[10];
        //입력
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
      
        }
        //출력
        for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j]);
        }
        
    }
}