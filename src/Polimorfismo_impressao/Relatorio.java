package Polimorfismo_impressao;

public class Relatorio extends Documento {
    public Relatorio(String nome) {
        super(nome);
    }

    @Override
    public void imprimir(){
        System.out.println("imprimindo Relatório: '" + nome + "'com cabeçalho e rodapé.");
    }

}
