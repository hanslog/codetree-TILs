import java.util.*;
//n개의 원소 주어졌을때 1~9까지 몇번 나왔는지 출력하기
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> array=new ArrayList<>();
        for(int i=0;i<n;i++){
            //위치입력신경쓰기!
            array.add(sc.nextInt());
        }
//출력숫자만들기-01
        List<Integer> newArray=new ArrayList<>();
        for(int i=0;i<100;i++){
            newArray.add(0);
        }
//출력숫자만들기-02
        List<Integer> cntArray=intNumber(array,newArray);
        for(int i=1;i<10;i++){
            System.out.println(cntArray.get(i));
        }
    }

//출력
    public static List<Integer> intNumber(List<Integer> array, List<Integer> newArray){
        for(int number:array){
            newArray.set(number,newArray.get(number)+1);
        }
        return newArray;
    }
}