package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Qual o tamanho do raio em cm? ");
        double raio = leitura.nextDouble();

        double circunferencia = (2 * raio) * pi;
        double area = pi * (raio * raio);

        System.out.println(String.format("Um circulo com o raio de %.1fcm tem a circunferencia de %.2fcm e area de %.2fcm",
                raio, circunferencia, area));
    }
}
