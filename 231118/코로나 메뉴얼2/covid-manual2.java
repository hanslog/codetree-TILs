//감기증상 있다 Y , 감기증상없다 N
//인원 과  위급상황 E 출력
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //30~40도사이 Y
        //한번에 3명검사 A로가는 사람 2명이상은 위급상황 E
        //1줄에 1명씩 총 3명 감기증상, 체온 공백두고 입력
        //감기증상 Y 또는 N 
// Y 또는 N / E / ABC신경쓰지말기

        Scanner sc=new Scanner(System.in);
        int[] hospital=new int[4];
        char[] cold=new char[3];
        int[] temp=new int[3];
        for(int i=0;i<3;i++){
            cold[i]=sc.next().charAt(0);
            temp[i]=sc.nextInt();


        if(cold[i]=='Y' && temp[i] >=37){
            hospital[0]++;
        }else if(cold[i]=='N' && temp[i] >=37){
            hospital[1]++;
        }else if(cold[i]=='Y' && temp[i] < 37){
            hospital[2]++;
        }else if(cold[i]== 'N' && temp[i] < 37){
            hospital[3]++;
        }

        }
 

        for(int i=0;i<4;i++){
            System.out.print(hospital[i]+ " ");
        }

        if(hospital[0]>=2){
            System.out.print("E");
        }

    }
}