package aula_Herenca_2_ArenaDeBatalha;

public class Heroi extends Personagem {

    private int pocoesDeCura;

    public Heroi(String nome, int pontosDeVida, int forca) {
        super(nome, pontosDeVida, forca);
        this.pocoesDeCura = 2;
    }
public void usarPocao(){
        if( pocoesDeCura > 0) {
            this.pontosDeVida += 20;
            this.pocoesDeCura --;
            System.out.println(this.nome + " usou uma poção de cura! Vida atual" + this.pontosDeVida);
            System.out.println("poções restantes: " + this.pocoesDeCura);
        } else {
            System.out.println(this.nome + " não tem mais poções de cura!");
        }
}

}
