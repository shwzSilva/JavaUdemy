package fundamentals.loops_condicionais;
//Crie um programa que imprima todos os números pares de 1 a 100 usando for.
public class For {
    public static void main(String[] args) {
        for(int i =1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
