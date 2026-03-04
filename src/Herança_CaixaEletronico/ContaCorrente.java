package Herança_CaixaEletronico;

public class ContaCorrente extends Conta {
    private double taxaDeMautencao = 15.90;

    public ContaCorrente(Cliente titular){
        //chama o construtor da classe mãe (Conta).
        super(titular);
    }

    // Metodo que só a ContaCorrente tem.
    public void cobrarTaxa(){
        this.saldo -= this.taxaDeMautencao;
        System.out.println(" Taxa de manutenção de R$ " + taxaDeMautencao + " cobrada da conta " + this.numero);
    }

}
