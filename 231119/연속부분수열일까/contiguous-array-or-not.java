import java.util.*;
public class Main {
    public static void main(String[] args) {
        //연속으로이어지면 부분수열 YES /연속 중간 끊기면 NO
        //처음 A=n1, A=n2 /두번째 n1원소/3번째 n2원소
     
		        Scanner sc = new Scanner(System.in);
		        int n1 = sc.nextInt();
		        int n2 = sc.nextInt();
		        boolean result = false;
		        

		        int[] arr1 = new int[n1];
		        int[] arr2 = new int[n2];

		        for (int i=0; i<n1; i++){
		            arr1[i] = sc.nextInt();
		        }
		        for (int i= 0; i<n2; i++){
		            arr2[i] = sc.nextInt();
		        }

		    
		        for (int i = 0; i<n1; i++){
		        	//연속으로 이어지게 하기위해 0부터 간다
		            if (arr1[i] == arr2[0]){
		                for (int j=0; j<n2; j++){
		                    if (arr2[j] == arr1[i]){
		                        result = true;
		                        i++;    
		                        continue;
		                    }
		                    else {
		                        result = false;
		                        break;
		                    }
		                    
		                }
		
		            }
		        }
		        
		        if (result==true) 
		        	System.out.print("Yes");
		        else if (result==false){
		            System.out.print("No");
		        }
        
    
    }
}