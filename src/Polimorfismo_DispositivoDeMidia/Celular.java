package Polimorfismo_DispositivoDeMidia;

public class Celular extends DispositivoDeMidia{

    private String musicaAtual;
    private  String artista;

    public Celular(String nome, String musicaAtual, String artista) {
        super(nome);
        this.musicaAtual = musicaAtual;
        this.artista = artista;
    }
    @Override// sobreescreve o metodo que herdou da classe mae
public void reproduzir(){
        System.out.println("O " + this.nomeDoDispositivo + " Está tocando a música: '" + this.musicaAtual + "' de " + this.artista + ".");
    }
}
