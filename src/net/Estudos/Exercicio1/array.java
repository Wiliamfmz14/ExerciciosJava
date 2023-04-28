package net.Estudos.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);
        int contador;
        int tamanhoDaLista;
        var ArrayList = new ArrayList<Integer>();

        System.out.println("Qual número deseja iniciar? ");
        tamanhoDaLista = leitura.nextInt();
        contador = tamanhoDaLista;

        for(int i = 0; i < tamanhoDaLista; i++) {
            ArrayList.add(i, contador);
            System.out.print(ArrayList.get(i) + " ");
            contador--;
        }


    }
}
