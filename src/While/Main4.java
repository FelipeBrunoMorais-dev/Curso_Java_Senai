package While;

import java.util.Scanner;

public class Main4 {
    public static void main(String [] args) {

        Scanner s = new Scanner (System.in);
        int numero;

        System.out.println("Bem vindo a tabuada interativa!");
        System.out.println("Digite um número para ver a tabuada (ou 0 para sair)");
        numero = s.nextInt();
        while (numero !=0){
            System.out.println("Tabuada do " + numero + ": " );

            int i = 1;
            while ( i <=10){
                System.out.println (numero + " x" + i + " = " + (numero * i));
                i++;

            }
            System.out.println( "Digite outro número ou 0 para sair: ");
            numero = s.nextInt();
        }
        System.out.println("Programa encerrado. até a proxima");
    }
    }
