package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        var leitura  = new Scanner(System.in);
        int anos = 0;
        int meses = 0;
        int dias = 0;

        System.out.println("Digite sua idade em Dias: ");
        var idadeEmDias = leitura.nextInt();

        anos = idadeEmDias / 365;
        meses = (idadeEmDias % 365) / 30;
        dias = ((idadeEmDias % 365) % 30);
        System.out.println(String.format("Você tem %d ano(s) %d mes(es) e %d dia(s). ", anos, meses, dias));
    }
}
