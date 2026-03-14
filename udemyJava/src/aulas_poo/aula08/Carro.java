package aulas_poo.aula08;

public class Carro {
    public String modelo;
    public int ano;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("---------------------------");
    }
}
