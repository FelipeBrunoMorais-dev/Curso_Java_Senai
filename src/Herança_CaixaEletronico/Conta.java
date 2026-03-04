package Herança_CaixaEletronico;

public abstract class Conta {

    //protectes permite que as classe filhas acessam diretamente estes atributos
    protected  int numero;
    protected  Cliente titular;
    protected double saldo;
    private static int totalDaConta = 0;

    // construtor que será chamado pelas classes filhas via ''Super()'.
    public Conta (Cliente titular) {
        Conta.totalDaConta++;
        this.numero = totalDaConta;
        this.titular = titular;
        this.saldo = 0;
    }

    // métodos concretos que serão herdados por todas as contas filhas
    public void  depositar (double valor) {
        if (valor > 0 ) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + "realizado com sucesso");
        } else {
            System.out.println( "Valor de deposito inválido.");
        }

    }
    public boolean sacar (double valor) {
        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println( "Saque de R$ " + valor + " realizado com sucesso.");
        return true;
        } else {
            System.out.println("Operação Falhou! Saldo insuficiente ou valor invalido ");
            return false;
        }
    }

    public void transferir(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Transferência Concluida.");
        } else {
            System.out.println("Transferência não Realizada");
        }

    }
    public double getSaldo() {
        return this.saldo;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getNomeTitular(){
        return  this.titular.getNome();
    }

    public  void exibirDados(){
        System.out.println("--- Dados da Conta---");
        // getClass().getSimpleName() mostra o nome da clase especifica (ContaCorrente ou ContaPoupança)
        System.out.println("Tipo...:" + this.getClass().getSimpleName());
        System.out.println("Titular.:" + this.getNomeTitular());
        System.out.println("Número..: "+ this.getNumero());
        System.out.println("Saldo...: " + String.format("%.2f", this.getSaldo()));
        System.out.println("-------------------------------------");
    }
}
