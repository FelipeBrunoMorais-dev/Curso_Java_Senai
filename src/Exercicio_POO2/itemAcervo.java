package Exercicio_POO2;

public abstract class itemAcervo {

    private String Titulo, autor;
    private Integer ano;

    public itemAcervo(String titulo, String autor, Integer ano) {
        Titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return Titulo;
    }


    public String getAutor() {
        return autor;
    }


    public Integer getAno() {
        return ano;
    }

}
