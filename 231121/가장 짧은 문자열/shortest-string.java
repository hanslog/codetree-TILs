import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        if(str1.length()<str2.length())
            if(str2.length()<str3.length())
                System.out.println(str3.length()-str1.length());
    }
}