package POO_Frutas;

public class main12 {
    public static void main(String [] args){
        Estoque estoque = new Estoque();
        EntradadeDados entrada = new EntradadeDados();

        System.out.println("--- Gerenciador de POO_Frutas.Estoque de POO_Frutas.Frutas ---");

        int totalFrutas = 3;
        for (int i = 0; i < totalFrutas; i++){
            Frutas fruta = entrada.lerFruta();
            estoque.adicionarFrutas(fruta);
        }

        estoque.gerarRelatorio();
        entrada.fecharScanner();

    }
}
