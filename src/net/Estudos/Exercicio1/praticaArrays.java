package net.Estudos.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class praticaArrays {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);
        int tamanhoDaLista = 0;
        int contador = 1;
        var listaBuzz = new ArrayList<String>();
        System.out.println("Digite o tamanho da Lista: ");
        tamanhoDaLista = leitura.nextInt();
        while(contador <= tamanhoDaLista) {
            if(contador % 3 == 0 && contador % 5 == 0) {
                listaBuzz.add("FizzBuzz");
            }
            else {
                if(contador % 5 == 0) {
                    listaBuzz.add("Buzz");
                }
                else{
                    if(contador % 3 == 0) {
                        listaBuzz.add("Fizz");
                    }
                    else{
                        listaBuzz.add(Integer.toString(contador));
                    }
                }
            }
        contador++;
        }
        System.out.println(listaBuzz);
    }
}
