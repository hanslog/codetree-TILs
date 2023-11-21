import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        int length1=str1.length();
        int length2=str2.length();
        int length3=str3.length();

        int min=0;
        int max=0;
            if(length1<length2){

                min=length1;
            }
            if(length3>length2){
                max=length3;
            }
                System.out.println(max-min);
        }
    }