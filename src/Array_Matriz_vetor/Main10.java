package Array_Matriz_vetor;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int c,e;
        int [][] numeros = new int [3][2];
        c=0;
        e=0;

        for ( int i=0; i < 3 ; i++){
            for( int j=0 ; j<2; j++){
                System.out.println("Digite um valor pra posição c e i" );
                numeros [c] [e] = sc.nextInt();
            }
        }

        for ( int i=0; i < 3 ; i++){
            for( int j=0 ; j<2; j++) {
                System.out.printf("O valor esta na posição %d %d" , c,e);
            }}
    }
    }
