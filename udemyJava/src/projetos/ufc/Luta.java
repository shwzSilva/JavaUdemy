package projetos.ufc;
import java.util.Random;

public class Luta {
    Random random = new Random();

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovado = true;
            this.desafiante = l1;
            this.desafiado = l2;
            System.out.println("Luta marcada! " + desafiante.getNome() + " VS " + desafiado.getNome());
        } else {
            this.aprovado = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Luta não aprovada!");
        }
    }
    public void lutar(){
        if(this.aprovado == true){
            this.desafiante.status();
            this.desafiado.status();
        }else{
            System.out.println("Luta não aprovada!");
        }
        int vencedor = random.nextInt(3);
        switch (vencedor){
            case 0:
                System.out.println("Empatou!");
                this.desafiante.getEmpates();
                this.desafiado.getEmpates();
                break;
            case 1:
                System.out.println("O lutador " + this.desafiante.getNome() + " Venceu!!!");
                this.desafiante.getVitorias();
                break;
            case 2:
                System.out.println("O lutador " + this.desafiado.getNome() + " Venceu!!!");
                this.desafiado.getVitorias();
                    break;
        }
    }

    public void setDesafiado(Lutador lutadorDesafiado){

    }

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiante(Lutador lutadorDesafiante){

    }
    public Lutador getDesafiante(){
        return desafiante;
    }
}
