package aulas_poo.aula02;

public class Carro {
    //Atributos
    public String modelo;
    public String cor;
    public int anoDoModelo;
    private float kmRodado;
    private String motor;
    private String combustivel;
    protected boolean ligado;

    //Métodos
    private void ligar(){
        if(this.ligado = true ){
            System.out.println("Carro ligado!");
        }
    }

    public void desligar(){
        if(this.ligado = false){
            System.out.println("Carro desligado!");
        }
    }

    protected void andar(){
        if (this.ligado == true){
            System.out.println("Carro andando");
        }else {
            System.out.println("O carro está desligado");
        }
    }

}
