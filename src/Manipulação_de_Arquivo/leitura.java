package Manipulação_de_Arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitura {
    public static void main (String [] args){
        String caminhoArquivo = "ola.txt" ;// caminho do arquivo a ser lido

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha;
            while ((linha = leitor.readLine()) != null){
                System.out.println(linha);// imprime cada linha do arquivo
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
