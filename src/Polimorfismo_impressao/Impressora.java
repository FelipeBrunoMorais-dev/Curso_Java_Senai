package Polimorfismo_impressao;

public class Impressora {
    public static void main (String[] args){
        Documento [] filadeImpressao = {
                new Relatorio("Vendas_setembro.pdf"),
                new Foto("ferias_na_praia.jpg"),
                new Relatorio("balancete_anual.docx")
        };

        System.out.println("--- Iniciando Fila de impressão ---");
        //*** O polimorfismo acontece aqui
        // Para a impressora, tudo é apenas um 'documento.' Ela envia
        // o comando ' imprimir()' e o proprio objeto (Relatorio ou Foto)
        // se encarrea de executar a impressão da maneira correta.
        for (Documento doc : filadeImpressao){
            doc.imprimir();
        }
    }
}
