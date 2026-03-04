package Encapsulamento_jogador;

class Jogador {

    private String nome;
    private int pontuacao;
    private int vida;
    private static final int VIDA_MAXIMA = 100;


    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.vida = VIDA_MAXIMA;
        System.out.println("Encapsulamento_jogador.Jogador " + this.nome + " entrou no jogo!");

    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println(this.nome + " ganhou " + pontos + " pontos! Total: " + this.pontuacao);
        }
    }

    public void receberDano(int dano){
        if (dano > 0){
            this.vida += dano;
            if(this.vida < 0) this.vida = 0;
            System.out.println(this.nome + " recebeu " + dano + " de dano! Vida atual: " + this.vida);
        }
                if (this.vida == 0){
            System.out.println(this.nome + " foi derrotado!");
        }
    }
    public void receberCura(int cura){
        if( cura > 0 && this.vida > 0){
            this.vida+= cura;
            if (this.vida > VIDA_MAXIMA) this.vida = VIDA_MAXIMA;
            System.out.println(this.nome + " recuperou " + cura + " de vida! Vida atual: " + this.vida);

        }
    }
    public int getPontuacao() {return this.pontuacao;}
    public int getVida() { return  this.vida; }
    public  String getNome() {return  this.nome; }
}
