package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Qual o tamanho em cm do lado A? ");
        double trianguloA = leitura.nextDouble();

        System.out.println("Qual o tamanho em cm do lado B? ");
        double trianguloB = leitura.nextDouble();

        System.out.println("Qual o tamanho em cm do lado C? ");
        double trianguloC = leitura.nextDouble();

        double perimetro = trianguloA + trianguloB + trianguloC;

        System.out.println(String.format("O triangulo tem um perimetro de %.2fcm " , perimetro));
    }
}
