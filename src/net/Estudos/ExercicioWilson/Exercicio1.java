package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double base;
        double altura;
        int comando = 0;
        String unidadeMedida = null;
        Scanner leitura = new Scanner(System.in);
        System.out.println("          Calculadora de área");

        while(unidadeMedida != "0") {
            System.out.println("Digite a unidade de comprimento desejada: (cm/m/km)");
            unidadeMedida = leitura.nextLine();
            unidadeMedida = unidadeMedida.toLowerCase();
            if (unidadeMedida.equals("centimetro") || unidadeMedida.equals("metro") || unidadeMedida.equals("quilometro")
                || unidadeMedida.equals("cm") || unidadeMedida.equals("m") || unidadeMedida.equals("km") || unidadeMedida.equals("kilometro")) {
                System.out.println(String.format("Digite o valor da base em %s: ", unidadeMedida));
                base = leitura.nextDouble();

                System.out.println(String.format("Digite a altura em %s: ", unidadeMedida));
                altura = leitura.nextDouble();

                System.out.println(String.format("A área equivale a %.2f %s², e seu perimetro %.2f %s²", base * altura, unidadeMedida,
                        (base + altura) * 2, unidadeMedida));

                break;
            } else {
                System.out.println("Formato não aceito. Tente novamente ou pressione 0 para sair do programa.");
            }
        }
    }

}
