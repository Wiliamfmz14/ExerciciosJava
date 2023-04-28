package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado do quadrado? ");
        double ladoDoQuadrado = leitura.nextDouble();

        double area = ladoDoQuadrado * ladoDoQuadrado;
        double perimetro = ladoDoQuadrado * 4;

        System.out.println(String.format("A area equivale a %.2f e o perimetro equivale a %.2f" , area, perimetro));
    }
}
