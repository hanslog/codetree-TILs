//N개의 원소로 이루어진 배열받아 짝수인 원소2로 나눈값출력/홀수는 그냥출력

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      //5와 원소5개다 그럼 int도 있어야되지만 int[] 담을변수도 있어야지 뺴먹지마!!
      int[] array=new int[N];

      for(int i=0;i<N;i++){
         array[i]=sc.nextInt();
      }

      modify(array, N);
  
    }
        public static void modify(int[] arr, int N){
            for(int i=0;i<N;i++){
                //조건제시 까먹지말구 2개야 짝수, 홀수!!
                if(arr[i]%2==0){
                    System.out.print(arr[i]/2+" ");
                }else{
                    System.out.print(arr[i]+" ");
            }
        }
    }
}