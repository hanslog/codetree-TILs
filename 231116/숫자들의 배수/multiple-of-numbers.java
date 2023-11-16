import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    //1~10 이하정수중 한개입력 배열 순서대로출력
    //힌트 5의배수 2번출력되면 종료
    //StringBuilder & append// reader.readLine().trim()에러안나려면 throws IOException해줘야함!!
    public static void main(String[] args) throws IOException  {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //출력단위 끊어서 10받아들이기위해 .trim();
        int insert=Integer.parseInt(reader.readLine().trim());
        int[] array=new int[10];
        StringBuilder str=new StringBuilder();

        if(insert%5!=0){
            for(int i=1;i<=10;i++){
                array[i-1]=insert*i;
                str.append(array[i-1]).append(" ");
            }
        }else{
            for(int j=1;j<=2;j++){
                array[j-1]=insert*j;
                str.append(array[j-1]).append(" ");
            }
        }
        System.out.println(str);

    }
}