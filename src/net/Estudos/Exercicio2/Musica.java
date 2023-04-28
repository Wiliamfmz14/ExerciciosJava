package net.Estudos.Exercicio2;

public class Musica extends Audio{
    private String artista;
    private String tonalidade;
    private String genero;
    private String album;

    //Getters
    public String getArtista(){
        return artista;
    }
    public String getTonalidade() {
        return tonalidade;
    }
    public String getGenero(){
        return genero;
    }
    public String getAlbum(){
        return album;
    }

    //SETTERS
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setTonalidade(String tonalidade) {
        this.tonalidade = tonalidade;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    //Methods


    @Override
    public void exibirFichaTecnica() {
        duracaoEmMinutos();
        System.out.println(String.format("""
                Titulo: %s
                Duração: %s
                Artista: %s
                Genero: %s
                Album: %s
                Tonalidade: %s
                Data de lançamento: %s
                Total curtidas: %d
                Total reproduções: %d
                
                """ , getTitulo(), getDuracaoEmMinutos(), getArtista(),getGenero(), getAlbum(), getTonalidade(),
                getDataDeLancamento(), getTotalCurtidas(), getTotalReproducoes()));
    }
}


