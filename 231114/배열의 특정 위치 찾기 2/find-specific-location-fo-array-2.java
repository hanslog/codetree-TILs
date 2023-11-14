import java.util.*;
public class Main {
    //10개정수 입력/홀수번째 입력받아 합과 짝수번째 입력합에서 큰수에서 작은수뺀갑출력
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] n=sc.nextLine().split(" ");
        char[] n2=new char[n.length];
        int one=0;
        int two=0;
        int difference2=0;
        int difference1=0;
        int difference3=0;
            for(char i=1;i<n2.length+1;i++){
                if(i%2==1){
                    one+=(int)i;
                }else{
                    two+=(int)i;
                }if(two>=one){
                    difference2+=two-one;
                }else{
                difference1+=one-two;
                }  
            }
                System.out.println(difference3=difference1-difference2);
            
        }
    }