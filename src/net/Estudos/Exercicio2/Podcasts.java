package net.Estudos.Exercicio2;

public class Podcasts extends Audio{
    private String host;
    private String descricao;

    //Getters
    public String getHost(){
        return host;
    }
    public String getDescricao() {
        return descricao;
    }


    //Setters
    public void setHost(String host) {
        this.host = host;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
