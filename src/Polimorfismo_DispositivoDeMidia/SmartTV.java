package Polimorfismo_DispositivoDeMidia;

public class SmartTV extends DispositivoDeMidia{

    private String filmeAtual;

    public SmartTV(String nome, String filmeAtual) {
        // 'Super(nome)' chama o construtor da classe mãe (DispositivoDeMidia).
        super(nome);
        this.filmeAtual = filmeAtual;
    }

    // A anotação @override indica que estamos cumprindo o "Contato"
    // e implementando o metodo abstrato da classe mãe

    @Override
    public void reproduzir(){
        System.out.println("A " + this.nomeDoDispositivo + " está reproduzindo o filme: '"+ this.filmeAtual + "' em 4K.");
    }
}
