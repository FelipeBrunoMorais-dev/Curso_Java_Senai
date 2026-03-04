package POO_Frutas;

import java.util.Scanner;

public class EntradadeDados {

    private Scanner scanner;

    public EntradadeDados (){
        scanner = new Scanner(System.in);
    }
    public Frutas lerFruta (){
        System.out.println( "Digite o nome da Fruta");
        String nome = scanner.nextLine();

        System.out.println( "digite a quantidade em estoque de " + nome + ":");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // consumir enter

        return new Frutas(nome,quantidade);
    }

    public void fecharScanner(){
        scanner.close();
    }
}
