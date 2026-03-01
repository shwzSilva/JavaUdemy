package projetos.contaBanco;
import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected  String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    Scanner sc = new Scanner(System.in);

    public ContaBanco(String tipo){
        this.setTipo(tipo);
        this.setDono(dono);

        this.setSaldo(0);
        this.setStatus(true);
    }

    public void abrirConta() {
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50.00);
        } else if (tipo == "CP") {
            this.setSaldo(150.00);
        } else {
            System.out.println("Tipo invalido");
        }
        System.out.println("Conta aberta "+ dono+ "! Saldo atual: R$" + saldo);
    }

    public void fecharConta(){
            if(saldo > 0){
                System.out.println("Para fechar a conta e necessario sacar o SALDO: R$" + saldo);
            } else if (saldo < 0) {
                System.out.println("Para fechar a sua conta e necessario depositar o valor da FATURA: R$" + saldo);
            } else {
                this.setStatus(false);
            }
        }

    public void depositar(){
            if(status == true){
                System.out.print("Digite o valor do deposito: R$");
                double valor = sc.nextDouble();
                if (valor > 0){
                    this.setSaldo(this.getSaldo() + valor);
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("Saldo atual: R$" + saldo);
                } else{
                    System.out.println("Digite um valor valido!");
                }
            } else{
                System.out.println("Você precisa abrir uma conta primeiro!");
            }
        }

    public void sacar() {
        if (status == true) {
            System.out.print("Digite o valor do saque: R$");
            double saque = sc.nextDouble();
            if (saque <= saldo && saque > 0) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado com sucesso!");
                System.out.printf("Saldo atual: R$%.2f%n", saldo);
            } else {
                System.out.println("Digite um valor valido, SALDO atual: R$" + saldo);
            }
        } else {
            System.out.println("Você precisa abrir uma conta primeiro!");
        }
    }

    public void pagarMensal(){
        if(status == true) {
            if (tipo == "CC") {
                this.setSaldo(this.getSaldo() - 12.00);
            } else if (tipo == "CP") {
                this.setSaldo(this.getSaldo() - 20.00);
            }
            System.out.println("Mensalidade descontada do seu saldo!");
        } else {
            System.out.println("Conta não existe!");
        }
    }
    public void statusUser(){
        System.out.println("Número da conta: " + numConta);
        if(tipo == "CC" || tipo == "cc"){
            System.out.println("Tipo de conta: Corrente");
        }else{
            System.out.println("Tipo de conta: Polpança");
        }
        System.out.println("Dono da conta: " + dono);
        System.out.printf("Saldo atual: R$: %.2f%n", saldo);
        if(status == true){
            System.out.println("Conta: Ativa");
        } else {
            System.out.println("Conta: Cancelada");
        }
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}