package net.Estudos.ExercicioWilson;

import java.util.Scanner;

public class MenuNavegacaoCategorias {
    public static void exibeMenuCategorias() {
        var leitura = new Scanner(System.in);
        String navegaMenuCategorias = "1";
        while (!navegaMenuCategorias.equals("0")) {
            String menuCategorias = """
                    [1] Adicionar Categoria
                    [2] Remover Categoria
                    [3] Alterar Categoria
                    [4] Listar Categorias
                    [0] Voltar
                                        
                    Qual opção deseja? """;
            System.out.println(menuCategorias);
            navegaMenuCategorias = leitura.nextLine();
            switch(navegaMenuCategorias) {
                case "1": {
                    System.out.println("Insira o nome da Nova categoria:(Insira 0 para cancelar)");
                    String nome = leitura.nextLine();
                    if (!nome.equals("0")) {
                        BancoCategorias.ListaDeCategorias.add(new Categoria(nome));
                        System.out.println("Categoria adicionada com sucesso!");
                        break;
                    }
                    else {
                        break;
                    }
                }
                case "2": {
                    while (!navegaMenuCategorias.equals("0")) {
                        System.out.println(BancoCategorias.ListaDeCategorias);
                        System.out.println("Insira o ID da categoria que quer remover:(Insira 0 para retornar)");
                        var idInserido = leitura.nextLine();
                        if (!idInserido.equals("0")) {
                            boolean removido = BancoCategorias.ListaDeCategorias.removeIf(categoria -> categoria.getId().equals(idInserido));
                            if (removido) {
                                System.out.println("Categoria removida com sucesso!");
                            } else {
                                System.out.println("Categoria não encontrada.");
                            }
                        } else {
                            break;
                        }
                    }
                    break;
                }
                case "3":{
                    System.out.println(BancoCategorias.ListaDeCategorias);
                    System.out.println("Insira o ID da categoria que quer alterar: ");
                    var idInserido = leitura.nextLine();
                    for (Categoria categoria : BancoCategorias.ListaDeCategorias) {
                        if (idInserido.equals(categoria.getId())) {
                            System.out.println(String.format("O que deseja alterar em %s", categoria));
                            System.out.println("""
                                        [1] Nome
                                        [0] Voltar""");
                            var opcaoAlterar = leitura.nextLine();
                            if (opcaoAlterar.equals("1")) {
                                System.out.println("Qual o novo nome? ");
                                var nomeEscolhido = leitura.nextLine();
                                System.out.println(String.format("Digite 1 para confirmar mudança de %s para %s: ", categoria.getNome(), nomeEscolhido));
                                var confirmaAlteracao = leitura.nextLine();
                                if (confirmaAlteracao.equals("1")) {
                                    categoria.setNome(nomeEscolhido);
                                    System.out.println("Nome alterado! ");
                                }
                                else {
                                    System.out.println("Operação cancelada!");
                                }
                            }
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println(BancoCategorias.ListaDeCategorias);
                }
            }
        }
    }
}
