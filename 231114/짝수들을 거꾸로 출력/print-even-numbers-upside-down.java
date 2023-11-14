import java.util.*;
//n개의원소/ 짝수만 출력을 반대로하기
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String n2=sc.nextLine();
        String[] arr=n2.split(" ");
        ArrayList<String> arr2=new ArrayList<>();
        for(String number:arr){
            if(Integer.parseInt(number)%2==0){
                arr2.add(number);
            }
        }
        Collections.reverse(arr2);
        System.out.println(arr2+" ");  
    }
}