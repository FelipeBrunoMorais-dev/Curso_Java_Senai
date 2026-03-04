package Switch_case;

import java.util.Scanner;

public class Main3 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int menu;

        do {
            menu = exibirmenu (s);
            switch ( menu){
                case 1:
                    System.out.println("Stranger Things");
                    break;
                case 2:
                    System.out.println("Yu Yu hahusho");
                    break;
                case 3:
                    System.out.println("O incrivel mundo de Gumball");
                    break;

                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (menu !=0);

        s.close();

    }

    public static int exibirmenu(Scanner scanner) {
        System.out.println("***********ESTEFLIX**************");
        System.out.println("1. Stranger Things");
        System.out.println("2. Yu Yu hahusho");
        System.out.println("3. O incrivel mundo de Gumball");
        System.out.println(" Escolha uma opção (1 a 3 ou 0 para finalizar)");
        return scanner.nextInt();

    }

}
