import java.util.*;
public class Main {
    //10개정수 입력받고 3,5,10번째 정수합출력!!
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        int[] arr=new int[input.length];
        for(int i=0;i<=input.length-1;i++){
            arr[i]=Integer.parseInt(input[i]);
              
        }
            System.out.println(arr[2]+arr[4]+arr[9]);
  
    }
}