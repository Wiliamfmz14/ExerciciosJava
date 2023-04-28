package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Qual o valor do numerador? ");
        int numerador = leitura.nextInt();

        System.out.println("Qual o valor do divisor? ");
        int divisor = leitura.nextInt();

        int quociente = numerador / divisor;
        int resto = numerador % divisor;
        System.out.println(String.format("O quociente dessa operação é %d, e seu resto tem o valor de %d" , quociente, resto));
    }
}
