import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //입력받을내용 문자로 바꾸기 
        String[] input=sc.nextLine().split(" ");
        int[] arr=new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        int cnt=0;
        int sum=0;
        int cnt2=0;
        //입력받을내용숫자세기위해 for each로 써주기
    for(int array: arr){
        if(array==0){
            break;
        }
        cnt++;
    }
    for(int i=0;i<cnt;i++){
        if(arr[i]%2==0){
            sum+=arr[i];
            //주의사항 2의배수에 1은 제외하므로 cnt2는 1더해줘서 2부터시작
            cnt2+=1;
        }
    }
        System.out.println(cnt2+" "+sum);
    }
}