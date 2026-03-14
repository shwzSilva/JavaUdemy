package aulas_poo.aula01;

public class Caneta {
    //Atributos
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    //Métodos
    void status(){
        System.out.println("O modelo é "+ this.modelo);
        System.out.println("A cor é "+ this.cor);
        System.out.println("O tamanho da ponta é "+ this.ponta);
        System.out.println("A quantidade de carga é "+ this.carga);
        System.out.println("Ela esta tampada? "+ this.tampada);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Caneta tampada, nao posso rabiscar");
        } else {
            System.out.println("Caneta destampada, estou rabiscando");
        }
    }
    void tampada(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

}
