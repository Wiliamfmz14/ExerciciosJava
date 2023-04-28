package net.Estudos.Exercicio2;

import java.util.Scanner;

public class Audio {
    public static void main(String[] args) {

    }
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private String dataDeLancamento;
    private String duracaoEmMinutos;
    Scanner leitura;

    {
        leitura = new Scanner(System.in);
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public int getTotalReproducoes(){
        return totalReproducoes;
    }
    public int getTotalCurtidas(){
        return totalCurtidas;
    }
    public String getDataDeLancamento(){
        return dataDeLancamento;
    }
    public String getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
    public void setDuracaoEmMinutos(String duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Methods
    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void duracaoEmMinutos() {
        int minuto = 0;
        while(duracao >= 60) {
            minuto++;
            duracao -= 60;
        }
        duracaoEmMinutos = String.format("%dmins e %d segundos", minuto, duracao);
    }
    public void exibirFichaTecnica() {
        duracaoEmMinutos();
        System.out.println(String.format("""
                Titulo: %s
                Duração: %s
                Data de lançamento: %s
                Total curtidas: %d
                Total reproduções: %d
                """ , titulo, duracaoEmMinutos, dataDeLancamento, totalCurtidas, totalReproducoes));
    }

}
