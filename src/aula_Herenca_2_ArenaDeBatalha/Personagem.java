package aula_Herenca_2_ArenaDeBatalha;

public class Personagem {
    protected String nome;
    protected int pontosDeVida;
    protected int forca;

    public Personagem(String nome, int pontosDeVida, int forca) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.forca = forca;
    }
    //metodo que todos personagem terao: atacar outro personagem
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca " + alvo.nome);
        alvo.receberDano(this.forca);

    }
     public  void receberDano(int dano){
        this.pontosDeVida -= dano;
        if(this.pontosDeVida <= 0) {
            this.pontosDeVida = 0; // Evita vida negativa
            System.out.println(this.nome + " foi derrotado!");
        } else{
            System.out.println(this.nome + "recebeu " + dano + " de dano. Vida restante: " + this.pontosDeVida);

        }
     }

     // verifica se o personagem ainda está na batalha
    public  boolean estaVivo(){
        return this.pontosDeVida >0;
    }
    public void exibirStatus(){
        System.out.println( nome + " - Vida: " + pontosDeVida);
    }


    }
