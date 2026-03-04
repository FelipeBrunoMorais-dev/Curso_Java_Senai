package Switch_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String btn;
        int btncor;

        // Início do algoritmo
        System.out.print("Ligue o equipamento [on] ou Desligue [Off}: ");
        btn = teclado.nextLine();

        if ( btn.equalsIgnoreCase("on")) {
            System.out.println("Equipamento Ligado com sucesso!!!");


            System.out.println("Escolha a lâmpada que deseja ligar:");
            System.out.println("      [1] Lâmpada Azul");
            System.out.println("      [2] Lâmpada Verde");
            System.out.println("      [3] Lâmpada Amarela");
            System.out.println("      [4] Lâmpada Vermelha");

            btncor = teclado.nextInt();
//teclado.nextLine(); // Limpar o buffer após ler inteiro

            switch (btncor) {
                case 1:
                    System.out.println("Lâmpada Azul Ligada");
                    break;
                case 2:
                    System.out.println("Lâmpada Verde Ligada");
                    break;
                case 3:
                    System.out.println("Lâmpada Amarela Ligada");
                    break;
                case 4:
                    System.out.println("Lâmpada Vermelha Ligada");
                    break;
                default:
                    System.out.println("Botão de emergência Acionado");
                    break;
            }
        } else {
            /*System.out.print("Desligue o equipamento [off]: ");
            btn = teclado.nextLine();
*/
            System.out.print("Equipamento desligado com sucesso");
        }
        teclado.close();
    }
}