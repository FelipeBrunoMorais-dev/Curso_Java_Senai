package Encapsulamento_jogador;

import java.util.Scanner;

public class TesteJogador {

    public  static void main(String[] args ){
        System.out.println( "--- Simulando uma Partida ----");
        Scanner sc = new Scanner(System.in);


        Jogador heroi = new Jogador ("Goku");

        System.out.println("\nDerrotando um inimigo... informe quantos pontos");
        int pontosderota = sc.nextInt();
        heroi.adicionarPontos(pontosderota);

        System.out.println("\nRecebendo um ataque forte...");
        heroi.receberDano(40);

        System.out.println("\nUsando uma poção");
        heroi.receberCura(30);

        System.out.println("\nRecebendo um ataque devastador");
        heroi.receberDano(150);

        sc.close();

    }
}
