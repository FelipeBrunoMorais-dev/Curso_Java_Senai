package IF_For;

import java.util.Scanner;

public class Main5 {
    public static void main(String [] args) {
    Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = s.nextLine();
        double [] notas = new double [4];
        double soma = 0;

        for (int i =0; i<4; i++){
            System.out.println("digite a " + (i +1) + "* nota:  ");
            notas [i] = s.nextDouble();
            soma += notas[i];
        }

        double media = soma /4;
        if (media >= 7){
            System.out.println(nome + "sua média final é: " + media + "e você esta aprovado!!!");

        } else {
            System.out.println(nome + "sua média final é: " + media + "e você esta Reprovado!!!");
        }
    }
    }