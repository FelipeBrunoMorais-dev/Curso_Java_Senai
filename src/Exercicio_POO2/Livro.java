package Exercicio_POO2;

public class Livro extends itemAcervo{

    public Integer pagLivro;

    public Livro(String titulo, String autor, Integer ano, Integer pagLivro) {
        super(titulo, autor, ano);
        this.pagLivro = pagLivro;
    }
}



