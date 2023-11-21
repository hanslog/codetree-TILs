import java.util.*;
public class Main {
    //공백제거하기 outcome="";붙이기!! .replaceAll(" ", "")
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       String str=input.nextLine();
       String str2=input.nextLine();

       System.out.print(str.replaceAll(" ", ""));
          System.out.print(str2.replaceAll(" ", ""));
    }
}
