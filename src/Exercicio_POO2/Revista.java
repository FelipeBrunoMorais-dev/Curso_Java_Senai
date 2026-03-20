package Exercicio_POO2;

public class Revista extends itemAcervo{

    public Revista(String titulo, String autor, Integer ano, Integer ediRevista) {
        super(titulo, autor, ano);
        EdiRevista = ediRevista;
    }

    public Integer EdiRevista;

@Override
    public void exbirFichaCatalogoGrafica() {
    System.out.println(" ficha do livro");
    System.out.println(" titulo " + this.titulo);
    System.out.println(" autor" + this.autor);
    System.out.println(" Ano" + this.ano);
    System.out.println(" pagina" + this.EdiRevista);
    }

}
