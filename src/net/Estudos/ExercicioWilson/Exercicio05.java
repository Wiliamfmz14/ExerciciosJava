package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String [] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Deseja saber o sucessor de qual número? ");
        var numero = leitura.nextInt();
        var sucessor = numero + 1;

        System.out.println(String.format("O sucessor de %d é %d", numero, sucessor));
    }
}
