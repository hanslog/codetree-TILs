import java.util.*;
public class Main {
    //10개정수입력, 입력된정수 거꾸로 순서대로출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer> arr=new ArrayList<>();
       String[] input=sc.nextLine().split(" ");
       for(String number : input){
            arr.add(Integer.parseInt(number));
       }
       ArrayList<Integer> reverse=new ArrayList<>();
        for(int j=0;j<arr.size();j++){
            if(arr.get(j)==0){
                reverse=new ArrayList<>(arr.size()-1);
                Collections.reverse(reverse);
                break;
            }else{
                reverse=new ArrayList<>(arr);
               Collections.reverse(reverse);
            }
             for(int k: reverse){
                System.out.print(k+" ");
            }
            System.out.println();
        }
          
      
    }
}