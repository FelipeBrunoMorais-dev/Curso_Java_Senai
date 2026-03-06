package Polimorfismo_Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n --- Calculadora de Areas ---");
            System.out.println(" 1 - Criar um retandgulo");
            System.out.println(" 2 - criar um Circulo");
            System.out.println(" 3 - criar um quadrado");
            System.out.println( " 4 - Sair");
            System.out.println("Escolha uma opção: ");

            // a variavel 'figuraoUsuario é do tipo da Superclasse 'Figura';
            // ela pode assumir a forma de qualquer classe filha
             Figura figuraDousuario = null;
            try {
                opcao = sc.nextInt();
                switch (opcao){
                    case 1 :
                        System.out.println("Digite a base do retangulo");
                        double base = sc.nextDouble();
                        System.out.println("Digite a altura do retagulo: ");
                        double altura =  sc.nextDouble();
                        figuraDousuario = new Retangulo(base,altura);
                        break;
                    case 2:
                        System.out.println("Digite o raio do circulo: ");
                        double raio = sc.nextDouble();
                        // a variavel 'figuradoUsuario' Agora tem a Forma de um circulo
                        figuraDousuario = new Circulo(raio);
                        break;
                    case  3:
                        System.out.println("Digite o lado do quadrado");
                        double lado = sc.nextDouble();
                        figuraDousuario = new Quadrado(lado);
                        break;
                    case 4:
                        System.out.println("Até logo");
                        continue; // pula para proxima iteracao do while, que vai parar.
                    default:
                        System.out.println("opção inválida");
                        break;
                }

                //** O Polimosfismo Acontece aqui ***
                //se uma figura foi crida (Não importa qual)...

                if (figuraDousuario != null){
                    // esta única linha de códifo funciona para ambos os casos.
                    // p java sabe se deve chamar o 'calcularArea' do Retangulo ou do circulo
                    // com base no objeto que foi criado pelo usuário

                    System.out.println("-------------------------");
                    //String.format formata a quantidade de número depois da virgula
                    System.out.println(" a area da sua figura é: " + String.format("%.2f", figuraDousuario.calcularArea()));
                    System.out.println("----------------------------------");
                }
            } catch (InputMismatchException e){
                System.out.println("Erros: Por favor, digite um valor número válido.");
                sc.next();
            }

        }
        sc.close();
    }

}

