import java.util.*;
public class Main {
    public static void main(String[] args) {
        //연속으로이어지면 부분수열 YES /연속 중간 끊기면 NO
        //처음 A=n1, A=n2 /두번째 n1원소/3번째 n2원소
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int[] element1=new int[n1];
        int[] element2=new int[n2];
        //선택한게 맞으면 true로 먼저 false로간다
        boolean choose=false;  

        for(int i=0;i<n1;i++){
            element1[i]=sc.nextInt();
        }

        for(int i=0;i<n2;i++){
            element2[i]=sc.nextInt();
        }
        //n1 4개
        for(int i=0;i<n1;i++){
            //n2값이 n1과 같을때는 0부터 나열하므로
                  choose=true;
            if(element1[i]==element2[0]){
                for(int k=0;k<n2;k++ ){
                    if(element2[k]==element1[i]){
                        //맞을때 쭉가게 true로하고 몇개까지 맞는지 i++로 지정
                        i++;
                        //나머지 튕겨버리기
                        continue;
                    }else{
                        choose=false;
                        break;
                    }
                }
                //forloop로 다시돌아 맞으면 중지한다/ 밖으로 돌아 YES,NO선택 false는 중지해도 true는 중지아니라 튕겨서 돈다
                if (choose == true) {
                    System.out.println("Yes");
		            break;
		        }else{
                   System.out.println("No");
                }
            }  
      
        }
   
       
        
    
    }
}