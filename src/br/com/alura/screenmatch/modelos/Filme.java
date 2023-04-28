package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String nome, int faixaEtaria){
        super(nome, faixaEtaria);
    }

    public String getdiretor() {
        return diretor;
    }
    public void setDiretor (String diretor) {
        this.diretor = diretor;
    }



    }



