//함수만들어서 쓰기 //main에다 다쳐박지 말기 이제 필요할때마다 나눠서 쓰기
public class Main {

    public static void star(){
        for(int i=0;i<10;i++){
            System.out.print("*");
        }
               System.out.println();
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            star();
        }
    }
}