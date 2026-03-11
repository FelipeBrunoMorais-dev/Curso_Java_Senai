package Manipulação_de_Arquivo;

import java.io.*;
import java.util.Scanner;

public class LeituraEEscrita {
    public static void main(String[] args) {
        String caminhoArquivo = "outro.txt";
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n ======= MENU ========");
            System.out.println("1 - Escrever no arquivo");
            System.out.println("2 - ler o arquivo");
            System.out.println("0 - sair");
            System.out.println("Escolher uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // lompa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("digite o tecto para adicionar no arquivo ");
                    String texto = scanner.nextLine();
                    escreverNoArquvivo(caminhoArquivo, texto);
                    break;
                case 2:
                    lerArquivo(caminhoArquivo);
                    break;

                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção Inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    public static void escreverNoArquvivo(String caminho, String texto) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))) {
            escritor.write(texto);
            escritor.newLine();
            System.out.println("texto gravado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }

    public static void lerArquivo(String caminho) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;
            System.out.println("\n --- Conteúdo de arquivo -----");
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("-----------------------------------------");
        } catch (IOException e) {
            System.out.println(" erro ao ler arquivo: " + e.getMessage());
        }
    }
}


