package Herança_CaixaEletronico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //Dados do Banco
        //agora criamos instâncias das Classes Especificas
        Cliente cliente1 = new Cliente("Clark Kent", "111.222.333-44");
        Conta conta1 = new ContaCorrente(cliente1);
        conta1.depositar(1500.0);

        Cliente cliente2 = new Cliente("Bruce Wayne" , "888.999.000-11");
        Conta conta2 = new ContaPoupanca(cliente2); // Bruce tem uma Conta Poupança
        conta2.depositar(100000.0);

        // colocamos as contas em um array do tipo da superclasse (conta).
        // iso é polimosfismo: o array pode guardar qualquer objeto que seja uma Conta.
        Conta [] contasDoBanco = {conta1,conta2};
        Conta contaAtiva = contasDoBanco[0];

        int opcao = 0;

        while (opcao !=8){
            System.out.println("\n --- Caixa Eletronico zz Bank ---");
            System.out.println("Bem-vindo(a), " + contaAtiva.getNomeTitular() + "| Conta: " + contaAtiva.getClass().getSimpleName());
            System.out.println("1 - Consulta Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3- Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Trocar de conta (Login)");

        // --- Opções Especificas de cada Conta
        // O operador "Instaceof" verifica o tipo real do objeto.
        if (contaAtiva instanceof ContaCorrente){
            System.out.println(" 6 - Cobrar Taxa de Manutenção");
        }

        if (contaAtiva instanceof ContaPoupanca){
            System.out.println(" 7 - Fazer Render Juros");
        }
            System.out.println("8 - Transferência via Pix");
            System.out.println("9 - Sair");
            System.out.println("Escolha uma opção: ");

        try { // Verificando de erros com o Catch
            opcao = scanner.nextInt();

            switch (opcao){
                case 1: contaAtiva.exibirDados(); break;
                case 2:
                    System.out.println("Digite o valor para depositar: ");
                    contaAtiva.depositar(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("digite o valor para Sacar: ");
                    contaAtiva.sacar(scanner.nextDouble());
                case 4:
                    System.out.println("Digite o numero da conta destino: ");
                    int numContaDestino = scanner.nextInt();
                    Conta contaDestino = null;
                    for (Conta c : contasDoBanco) if (c.getNumero() == numContaDestino) contaDestino = c;

                    if (contaDestino != null && contaDestino != contaAtiva){
                        System.out.println("Digite o valor para Transferir");
                        contaAtiva.transferir(contaDestino, scanner.nextDouble());
                    }else {
                        System.out.println("Conta destino inválida ou igual à origem");
                    }
                    break;

                case 5:
                    System.out.println("\n --- Contas Disponiveis ---");
                    for (Conta c : contasDoBanco){
                        System.out.println("N " + c.getNumero() + " - " + c.getClass().getSimpleName() + " -" + c.getNomeTitular());

                    }
                    System.out.println("digite o número da conta desejada: ");
                    int numContaLogin = scanner.nextInt();
                    boolean encontrada = false;
                    for (Conta c : contasDoBanco){
                        if (c.getNumero() == numContaLogin){
                            contaAtiva = c;
                            encontrada = true;
                            break;
                        }
                    }
                 case 6:
                    if (contaAtiva instanceof  ContaCorrente){
                        //é preciso fazer um cast para acessar o metodo especifico.
                        // dizemos ao compilador: trate esse objeto como uma ContaCorrente
                        ((ContaCorrente) contaAtiva).cobrarTaxa();
                    } else {
                        System.out.println("opção válida apens para Contas Correntes.");
                    }
                    break;
                case 7:
                    if (contaAtiva instanceof ContaPoupanca){
                        //fazendo o cast para ContaPoupança
                        ((ContaPoupanca) contaAtiva).rendeJuros();
                    } else {
                        System.out.println("Opção inválida para contas Poupanças");
                    }
                    break;
                case 8:
                    

                case 9:
                    System.out.println("\n obrigado por usar o ZZ Bank. Volte Sempre!");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
             } catch (InputMismatchException e){
            System.out.println("Erro: Por favor, digite apenas números.");
            scanner.next();
        }

        }
        scanner.close();
    }
}
