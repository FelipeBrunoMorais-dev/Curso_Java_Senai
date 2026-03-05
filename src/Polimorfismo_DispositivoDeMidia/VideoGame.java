package Polimorfismo_DispositivoDeMidia;

public class VideoGame extends DispositivoDeMidia {

    private String nomeVideoGame;

    public VideoGame(String nome, String nomeVideoGame) {
        super(nome);
        this.nomeVideoGame = nomeVideoGame;
    }

    @Override
    public void reproduzir(){
        System.out.println("O VideoGame é o " + this.nomeVideoGame);
    }


}
