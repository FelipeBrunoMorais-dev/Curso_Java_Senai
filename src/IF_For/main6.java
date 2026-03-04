package IF_For;

import java.util.Scanner;

public class main6 {

    public static int contarEstoqueBaixo(int[] quantidades) {
        int contador = 0;
        for (int i = 0; i < quantidades.length; i++) {
            if (quantidades[i] < 10) {
                contador++;

            }

        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String [] frutas = new String [3];
        int [] quantidades = new int[3];

        System.out.println("--- Gerenciador de POO_Frutas.Estoque de POO_Frutas.Frutas ---");

        for ( int i = 0; i< 3; i++ ){
            System.out.println("Digite o nome da fruta " + (i + 1) + ":");
            frutas [i] = s.nextLine();
            System.out.println("Digite a quantidade em estoque de " + frutas[i] + ":" );
            quantidades[i] = s.nextInt();
            s.nextLine();
        }
        System.out.println("\n ---- Relatorio de POO_Frutas.Estoque---");

        int totalBaixo = 0;

        for (int i=0; i<3; i++){
            if (quantidades[i] < 10){
                System.out.println("Alerta: A fruta " + frutas[i] + " está com estoque baixo Apenas" + quantidades[i] + " unidades." );
                totalBaixo++;
            }

               }

        int totalFuncao = contarEstoqueBaixo(quantidades);

        System.out.println("\ntotal de frutas com estoque baixo (Contado no main): " + totalBaixo);
        System.out.println("Total de POO_Frutas.Frutas com estoque baixo (Contado pela funça): "+ totalFuncao);

        s.close();



    }

    }
