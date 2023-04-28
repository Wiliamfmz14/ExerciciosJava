package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int faixaEtaria;
    private boolean inclusoNoPlano;
    private int totalAvaliacoes;
    private String sinopse;
    private int duracaoEmMinutos;



    public Titulo(String nome, int faixaEtaria) {
        this.setNome(nome);
        this.setFaixaEtaria(faixaEtaria);
    }


    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean getInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //METHODS
    public void exibeFichaTecnica() {
        System.out.println("Nome do titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + mediaAvaliacoes());
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("A duração total é de " + getDuracaoEmMinutos() + " minutos ou ");
    }


    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    private double mediaAvaliacoes() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + anoDeLancamento + ")";
    }
}
