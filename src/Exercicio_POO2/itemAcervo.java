package Exercicio_POO2;

public abstract class itemAcervo {

    String titulo;
    String autor;
    Integer ano;

    public itemAcervo(String titulo, String autor, Integer ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public abstract void exbirFichaCatalogoGrafica();
}
