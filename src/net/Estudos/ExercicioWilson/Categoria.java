package net.Estudos.ExercicioWilson;

public class Categoria {
    private String id;
    private String nome;
    private static int categoriasCriadas;

    public Categoria(String nome) {
        this.id = String.valueOf(++categoriasCriadas);
        this.nome = nome;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    @Override
    public String toString() {
        return "Categoria{" +
               "id='" + id + '\'' +
               ", nome='" + nome + '\'' +
               '}';
    }
}
