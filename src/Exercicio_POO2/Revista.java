package Exercicio_POO2;

public class Revista extends itemAcervo{

    public Revista(String titulo, String autor, Integer ano, Integer ediRevista) {
        super(titulo, autor, ano);
        EdiRevista = ediRevista;
    }

    public Integer EdiRevista;

}
