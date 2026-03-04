package Switch_case;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int programa;
        do {

            System.out.println("***********ESTEFLIX**************");
            System.out.println("1. Stranger Things");
            System.out.println("2. Yu Yu hahusho");
            System.out.println("3. O incrivel mundo de Gumball");
            System.out.println(" Escolha uma opção (1 a 3 ou 0 para finalizar)");
            programa = s.nextInt();


            switch (programa) {

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

        }while ( programa != 0);
        s.close();

    }
}