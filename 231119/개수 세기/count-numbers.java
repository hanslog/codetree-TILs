import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //cnt활용
        int cnt=0;
        //int로 m있는지 맞추려면 array배열받은거 돌려봐야함
        for(int k=0;k<n;k++){
            if(array[k]==m){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}