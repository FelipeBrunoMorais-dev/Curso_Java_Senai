package Exercicio_POO2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {
        Membro membro1 = new Membro("Ana Beatriz", 1234);

        itemAcervo livro = new Livro("Harry","JK",2013,5000);
        itemAcervo Revista = new Revista("revista 1","Felipe", 2025,136);
        itemAcervo midia = new MidiaDigital("teste 2","Felipe 2", 2024, "Facebook");

        List<itemAcervo> acervoCompleto = new ArrayList<>();
        acervoCompleto.add(livro);
        acervoCompleto.add(Revista);
        acervoCompleto.add(midia);

        System.out.println("*** Exibindo o acervo Completo ***");




    }
}