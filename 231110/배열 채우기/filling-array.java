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
       Collections.converse(arr);
        for(int j=0;j<arr.size();j++){
            if(arr.get(i)==0){
                ArrayList<Integer> converse=new ArrayList<>();
            for(int k: converse){
                System.outprint(k+" ");
            }
            break;
            }
        }
      
    }
}