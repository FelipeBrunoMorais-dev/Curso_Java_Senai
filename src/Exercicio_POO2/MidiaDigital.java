package Exercicio_POO2;

public class MidiaDigital extends itemAcervo{

    public String localMidia;

    public MidiaDigital(String titulo, String autor, Integer ano, String localMidia) {
        super(titulo, autor, ano);
        this.localMidia = localMidia;
    }
@Override
    public void exbirFichaCatalogoGrafica() {
    System.out.println(" ficha do livro");
    System.out.println(" titulo " + this.titulo);
    System.out.println(" autor" + this.autor);
    System.out.println(" Ano" + this.ano);
    System.out.println(" pagina" + this.localMidia);
    }}
