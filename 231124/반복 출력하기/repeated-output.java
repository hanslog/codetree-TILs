//백준,프로드가기 아직 코드구현이 원활하지가 않아 속상하다
//같이 연습하면서 하자//함수 잘써보기 앞으로 쭉쭉 쫙쫙 나가야됨!
import java.util.*;
public class Main {
    //정수 N줄걸쳐 12345^&*()_출력
    public static void printnumberspecial(int n){
        for(int i=0;i<n;i++){
            System.out.print("12345^&*()_");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        printnumberspecial(N);
    }
}