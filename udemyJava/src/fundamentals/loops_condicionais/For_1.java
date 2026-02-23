package fundamentals.loops_condicionais;

public class For_1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i + " par");
            } else{
                System.out.println(i + " impar");
            }
        }
    }
}
