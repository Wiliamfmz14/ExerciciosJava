package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int navegadorMenuPrincipal = 1;
        int navegadorMenuSecundario = 1;

        String menuPrincipal = """
                [1] Configurar  Categorias
                [2] Configurar Produtos
                [3] Conferir estoque
                [0] Encerrar programa
                
                Qual opção deseja? """;

        String menuProdutos = """
                [1] Adicionar Produtos
                [2] Remover Produtos
                [3] Alterar produtos
                [4] Listar Produtos
                [0] Voltar
                
                Qual opção deseja? """;

        System.out.println("Bem vindo ao controlador de estoque!\n");
        while(navegadorMenuPrincipal != 0) {
            System.out.println(menuPrincipal);
            navegadorMenuPrincipal = leitura.nextInt();
            if (navegadorMenuPrincipal > 0 &&  navegadorMenuPrincipal < 4){
                if (navegadorMenuPrincipal == 1) {
                    MenuNavegacaoCategorias.exibeMenuCategorias();
                }
                if (navegadorMenuPrincipal == 2) {
                    System.out.println(menuProdutos);
                    navegadorMenuSecundario = leitura.nextInt();
                }
                if (navegadorMenuPrincipal == 3) {
                    System.out.println("me mama");
                }

            }
            if (navegadorMenuPrincipal < 0 || navegadorMenuPrincipal > 3) {
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("Programa encerrado");
    }

}
