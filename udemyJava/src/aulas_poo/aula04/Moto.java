package aulas_poo.aula04;

public class Moto {
    public String modelo;
    private int anoLancamento;
    public String cor;
    public boolean ligar;

    public Moto(String m, int ano, String c){ //Constructor
        this.modelo = m;
        this.anoLancamento = ano;
        this.cor = c;
        this.desligada();

    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    public void setAnoLancamento(int ano){
        this.anoLancamento = ano;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano do veiculo: " + this.anoLancamento);
        System.out.println("A cor é: " + this.cor);
        System.out.println("A moto está: " + this.ligar);
    }
    public void ligada(){
        if(this.ligar = true){
            System.out.println("ligada");
        }
    }
    public void desligada(){
        if(this.ligar = false){
            System.out.println("desligada");
        }
    }
}
