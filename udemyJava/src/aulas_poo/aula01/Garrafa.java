package aulas_poo.aula01;

public class Garrafa {
    String modelo;
    float qtdMl;
    String cor;
    boolean tampada;

    void status(){
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("A quantidade de ml é: " + this.qtdMl);
        System.out.println("A cor é: " + this.cor);
        System.out.println("Ela está tampada: " + this.tampada);
    }
    void beber(){
        if(tampada == true){
            System.out.println("Ela está tampada, não sai agua");
        } else {
            System.out.println("Ela está destampada, sai agua");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
