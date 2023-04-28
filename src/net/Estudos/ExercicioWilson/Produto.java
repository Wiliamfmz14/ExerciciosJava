package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Produto {
    private String nome;
    private Categoria categoria;
    private double preco;
    private int quantidade;


    //GETTERS
    public String getNome() {return nome;}
    public Categoria getCategoria() {return categoria;}
    public double getPreco() {return preco;}
    public int getQuantidade() {return quantidade;}

    //SETTERS
    public void setNome(String nome) {this.nome = nome;}
    public void setCategoria(Categoria categoria) {this.categoria = categoria;}
    public void setPreco(double preco) {this.preco = preco;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    //METHODS

}