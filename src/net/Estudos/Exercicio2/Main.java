package net.Estudos.Exercicio2;

public class Main extends Audio {
    public static void main(String[] args) {

        //Musicas
        Musica killbill = new Musica();
        killbill.setTitulo("Kill Bill");
        killbill.setDuracao(173);
        killbill.setDataDeLancamento("2022");
        killbill.setArtista("SZA");
        killbill.setAlbum("SOS");
        killbill.setGenero("R&B");
        killbill.setTonalidade("A♭ Major");
        killbill.exibirFichaTecnica();


        //Podcasts
        Podcasts easyGerman = new Podcasts();
        easyGerman.setTitulo("Easy German ");
        easyGerman.setDuracao(1173);
        easyGerman.setDataDeLancamento("2022");
        easyGerman.setHost("Janusz");
        easyGerman.setDescricao("Um podcast descontraído com o objetivo de te ajudar a aprender alemão.");

        easyGerman.exibirFichaTecnica();

    }
}
