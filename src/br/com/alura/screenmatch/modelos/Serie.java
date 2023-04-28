package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo{
    private int temporadas;
    private int totalEpisodios;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int faixaEtaria) {
        super(nome, faixaEtaria);
    }


    //Getters
    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodios() {
        return totalEpisodios;
    }
    public boolean getAtiva() {
        return ativa;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public int getDuracaoEmMinutos() {
        return totalEpisodios * minutosPorEpisodio;
    }

    //Setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //Methods

}

