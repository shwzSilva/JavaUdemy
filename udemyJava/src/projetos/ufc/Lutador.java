package projetos.ufc;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){

        System.out.println("###### LUTADOR ######");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "cm" );
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("N. Vitorias: " + this.getVitorias());
        System.out.println("N. Derrotas: " + this.getDerrotas());
        System.out.println("N. Empates: " + this.getEmpates());
        System.out.println("#####################");
    }
    public void status(){
        System.out.println("NOME: " + this.getNome());
        System.out.println("NACIONALIDADE: " + this.getNacionalidade());
        System.out.println("CATEGORIA: " + this.getCategoria());
        System.out.println("VITORIAS: " + this.getVitorias());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    public void empates(){
        this.setEmpates(this.getEmpates() +1);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double al){
        this.altura = al;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double pe){
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.peso <= 52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 60) {
            this.categoria = "Pena";
        } else if (this.peso >= 60) {
            this.categoria = "Médio";
        } else if (this.peso >= 90) {
            this.categoria = "Pesado";
        }
    }

    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return derrotas;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
}
