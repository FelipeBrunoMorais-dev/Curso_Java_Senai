package aula_Herenca_2_ArenaDeBatalha;

public class Monstro extends Personagem{

    private String tipoDeAtaque;


    public Monstro(String nome, int pontosDeVida, int forca, String tipoDeAtaque) {
        super(nome, pontosDeVida, forca);
        this.tipoDeAtaque = tipoDeAtaque;
    }

    @Override
    public void atacar (Personagem alvo){
        System.out.println(this.nome + " usa " + this.tipoDeAtaque + " em " + alvo.nome + "!");
        alvo.receberDano(this.forca);
    }
}
