package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Filmes
        Filme aOrigem = new Filme("A Origem" , 16);
        aOrigem.setAnoDeLancamento(2010);
        aOrigem.setDuracaoEmMinutos(148);
        aOrigem.setInclusoNoPlano(true);
        aOrigem.setDiretor("Christopher Nolan");
        aOrigem.avalia(8.0);

        aOrigem.exibeFichaTecnica();


        var azulCobalto = new Filme("Azul Cobalto" , 16);
        azulCobalto.setAnoDeLancamento(2022);
        azulCobalto.setDuracaoEmMinutos(113);
        azulCobalto.setInclusoNoPlano(true);
        azulCobalto.setDiretor("Sachin Kundalkar");
        azulCobalto.avalia(6.8);

        azulCobalto.exibeFichaTecnica();

        var interestelar = new Filme("Interestelar", 12);
        interestelar.setAnoDeLancamento(2015);
        interestelar.setDuracaoEmMinutos(200);
        interestelar.avalia(9.3);

        //Series
        Serie breakingBad = new Serie("Breaking bad" , 16);
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setInclusoNoPlano(true);
        breakingBad.setTemporadas(5);
        breakingBad.setEpisodios(62);
        breakingBad.setAtiva(false);
        breakingBad.setMinutosPorEpisodio(53);
        breakingBad.avalia(10.0);


        breakingBad.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(aOrigem);
        calculadora.inclui(azulCobalto);
        calculadora.inclui(breakingBad);
        System.out.println(String.format("O tempo total é de %d minutos.", calculadora.getTempoTotal()));


        //ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        var listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(aOrigem);
        listaDeFilmes.add(azulCobalto);
        listaDeFilmes.add(interestelar);

        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes.get(1).toString());
        System.out.println(listaDeFilmes);

    }
}