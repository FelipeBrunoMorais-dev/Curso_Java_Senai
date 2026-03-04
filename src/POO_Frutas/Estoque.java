package POO_Frutas;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Frutas> frutas;

    public Estoque(){
        frutas = new ArrayList<>();

    }

    public void adicionarFrutas (Frutas fruta){
        frutas.add(fruta);
    }

    public int contarEstoqueBaixo(){
        int contador = 0;
        for(Frutas fruta: frutas){
            if (fruta.isEstoqueBaixo()){
                contador++;
            }
        } return contador;
    }

    public void gerarRelatorio(){
        System.out.println("\n--- Relatório de POO_Frutas.Estoque ---");
        for (Frutas fruta : frutas){
            if (fruta.isEstoqueBaixo()){
                System.out.println("Alerta: A Fruta '" + fruta.getNome() + "' Está om POO_Frutas.Estoque baixo!" + fruta.getQuantidade() + " unidades.");

            }
        }
        System.out.println("Total de frutas com estoque baixo: " + contarEstoqueBaixo());

    }
}
