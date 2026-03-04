package Herança_CaixaEletronico;

public class ContaPoupanca extends Conta {
    private  double taxaDeJuros = 0.005; // 0.5% ao mês

    public ContaPoupanca (Cliente titular){
        // chama o construtor da classe mãe (conta).
        super(titular);
    }

    // Metodo que só a ContaPoupanca tem.
    public void rendeJuros(){
        double juros = this.saldo * this.taxaDeJuros;
        this.saldo += (juros);
        System.out.println(" Juros de R$ " + String.format("%.2f", juros) + "renderam na conta " + this.numero);
    }

}
