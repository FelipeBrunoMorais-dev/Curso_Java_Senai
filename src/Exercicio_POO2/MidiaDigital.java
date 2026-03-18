package Exercicio_POO2;

public class MidiaDigital extends itemAcervo{

    public String localMidia;

    public MidiaDigital(String titulo, String autor, Integer ano, String localMidia) {
        super(titulo, autor, ano);
        this.localMidia = localMidia;
    }
}
