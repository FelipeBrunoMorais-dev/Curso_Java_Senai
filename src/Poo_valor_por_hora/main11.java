package Poo_valor_por_hora;

import java.util.Scanner;

public class main11 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        double total;

        System.out.println("Dados do primeiro Poo_valor_por_hora.Funcionario: \r\n");
        f1.nomedocabra = sc.next();
        f1.valorPorHora = sc.nextDouble();
        f1.valor = sc.nextInt();
        //f1.total();
        //f1.nomedaCidade = sc.next();
       // System.out.println("dados do funcionario" + f1.nomedocabra + " " + f1.valor);


        System.out.println("Dados do segundo Poo_valor_por_hora.Funcionario: \r\n");
        f2.nomedocabra = sc.next();
        f2.valorPorHora = sc.nextDouble();
        f2.valor = sc.nextInt();
       // f2.total();

        //total = (f1.valor * f1.valorPorHora) + (f2.valor* f2.valorPorHora);

        System.out.printf("Total = %.2f%n" , f2.total() + f1.total());







        /*
        String nome1, nome2;
        double valorPorHora1, valorPorHora2, total;
        int horas1, horas2;

        System.out.println("Dados do primeiro Poo_valor_por_hora.Funcionario: \r\n");
        System.out.println("Digite o nome");
        nome1 = sc.next();

        valorPorHora1 = sc.nextDouble();
        horas1 = sc.nextInt();

        System.out.println("Dados do segundo Poo_valor_por_hora.Funcionario: ");
        nome2 = sc.next();
        valorPorHora2 = sc.nextDouble();
        horas2 = sc.nextInt();

        total = (valorPorHora1 * horas1) + (valorPorHora2 * horas2);

        System.out.printf("Total = %.2f%n" , total);*/
    }
}
