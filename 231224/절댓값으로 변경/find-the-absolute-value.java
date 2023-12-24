//각각 절대값 씌워주는 함수 작성, 해당함수호출, 원소값출력

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<N;i++){
            array.add(sc.nextInt());
        }

        modify(array);
        for(int number:array){
            System.out.print(number+" ");
        }

    }

    public static void modify(ArrayList<Integer> array){
        for(int i=0;i<array.size();i++){
          //여기서 한참 해맸다
          //  array.get(i)로 가져와야지
              //-20,-35도 결국 음수는 0보다작아  -array.get(i)로 바꿔줘야지
            if(array.get(i)<0){
                array.set(i,-array.get(i));
            }
        }
    }
}