package net.Estudos.ExercicioWilson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);
        var categoriasSalvas = new ArrayList<Categoria>();
        categoriasSalvas.add(new Categoria( "Banana"));
        categoriasSalvas.add(new Categoria("Cevada"));
        categoriasSalvas.add(new Categoria( "Bamboo"));

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
        String menuCategorias = """
                [1] Adicionar Categoria
                [2] Remover Categoria
                [3] Alterar Categoria
                [4] Listar Categorias
                [0] Voltar
                
                Qual opção deseja? """;

        System.out.println("Bem vindo ao controlador de estoque!\n");
        while(navegadorMenuPrincipal != 0) {
            System.out.println(menuPrincipal);
            navegadorMenuPrincipal = leitura.nextInt();
            if (navegadorMenuPrincipal > 0 &&  navegadorMenuPrincipal < 4){
                if (navegadorMenuPrincipal == 1) {
                    System.out.println(menuCategorias);
                    navegadorMenuSecundario = leitura.nextInt();
                    if(navegadorMenuSecundario == 1) {
                        System.out.println("Qual nome? ");
                        String nome = leitura.next();
                        System.out.println("Categoria adicionada! ");
                        categoriasSalvas.add(new Categoria(nome));

                    }
                    if (navegadorMenuSecundario == 2) {
                        System.out.println("Insira o ID da categoria que deseja remover: ");
                        System.out.println(categoriasSalvas);
                        var idInserido = leitura.next();
                        boolean removido = false;
                        for (Categoria categoria : categoriasSalvas) {
                            if (categoria.getId().equals(idInserido)) {
                                categoriasSalvas.remove(categoria);
                                removido = true;
                            }
                        }
                        if (removido) {
                            System.out.println("Um item foi removido.");
                        }
                        else {
                            System.out.println(String.format("A categoria com o ID %s não foi encontrada." , idInserido));
                        }
                    }
                    if(navegadorMenuSecundario == 4) {
                        System.out.println(categoriasSalvas);
                    }

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
