import java.util.*;
//10미만 정수 2개, 순서대로 1,2번째 항으로 설정, 3번째부터 전전항과 전항의 합구하기/그합의 1의자리 채우기/차례로 10개 출력
//list에서 ArrasyList와String 활용 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> array=new ArrayList<>();
        String[] insert=sc.nextLine().split(" ");

        for(String number:insert){
            array.add(Integer.parseInt(number));
        }
        for(int i=2;i<10;i++){
            //순서대로 1,2번째항 설정과 3번째합구하기/1의자리 채우기위해 %10으로나누기
            array.add((array.get(array.size()-1)+array.get(array.size()-2))%10);
        }
        for(int element:array){
            System.out.print(element+" ");
        }

    }
}