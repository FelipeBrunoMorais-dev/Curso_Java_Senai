package Manipulação_de_Arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Criando_arquivo_escrita {

    public  static void main(String[] args){
        String caminhoArquivo = "ola.txt"; // Pode ser um novo arquivo ou existente

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))){
            escritor.write("primera linha do arquivo");
            escritor.newLine();// pula para proxima linha
            escritor.write("Segunda linha escrita com Java.");
            escritor.newLine();// pula para proxima linha
            escritor.write("Terceira linha escrita com Java.");
             }
             catch(IOException e){
            System.out.println("Erro ao Escreve no arquivo " + e.getMessage());
        }

                

    }
}
