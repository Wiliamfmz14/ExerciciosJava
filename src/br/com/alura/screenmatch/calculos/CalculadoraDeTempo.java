package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    private int horas;

    //GETTERS
    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getHoras() { return horas;}


    //METHODS
    private void calcularTempoTotal(int duracaoEmMinutos) {
        tempoTotal += duracaoEmMinutos;
    }
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        calcularTempoTotal(titulo.getDuracaoEmMinutos());
    }
    public void calcularHoras(int duracaoEmMinutos) {
        while (duracaoEmMinutos > 60) {
             duracaoEmMinutos -= 60;
            horas++;
        }
    }

}

