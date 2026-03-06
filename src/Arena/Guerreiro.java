package Arena;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 50);
    } // Mais vida, menos energia

    @Override
    public void usarHabilidade(Personagem alvo){
        int custoEnergia = 20;
        if (this.energia >= custoEnergia){
            this.energia -= custoEnergia;
            System.out.println(this.nome + " usa Golpe Fulminante em " + alvo.nome + "!");
        } else {
            System.out.println(this.nome + " Está sem energia para o Golpe Fulminante!");
        }
    }
}
