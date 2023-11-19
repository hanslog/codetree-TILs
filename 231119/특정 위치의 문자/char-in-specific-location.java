import java.util.*;
//6개 문자배열 'L','E', 'B','R','O','S'로 초기화후
//문자 한개 주어지면 배열첫번째 0, 배열 없는문자 None
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr={"L","E","B","R","O","S"};
        String word=sc.nextLine().trim();
        boolean key=true;
//유의사항 배열=length/ collection=size()/String= length() 문자열의 길이 
        for(int i=0;i<arr.length;i++){
     //여기서의 .equals는 String[]에 있는 int로 index 내용값 넣기 true로 먼저해서 있을동안만비교 
            if(arr[i].equals(word)){
                System.out.println(i);
                key=false;
                break;
            }
        }
        //key값인데 없으면 None하기
        if(key){
            System.out.println("None");
        }

    }
}