package PersistenciaDeDados;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AgendaManager {

    private final String nomeArquivo;

    public AgendaManager(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<Contato> carregarContatos() {
        List<Contato> contatos = new ArrayList<>();
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            return contatos;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Contato contato = Contato.daLinhaArquivo(linha);
                if (contato != null) {
                    contatos.add(contato);
                }
            }

            public void salvarContatos (List < Contato > contatos) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
                    for (Contato contato : contatos) {
                        writer.write(contato.paraLinhaArquivo());
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Erro ao salval contatos no arquivo: " + e.getMessage());
                }
            }

        }
