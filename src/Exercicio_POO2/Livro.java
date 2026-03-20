package Exercicio_POO2;

public class Livro extends itemAcervo implements Reservavel{

    public Integer pagLivro;

    public Livro(String titulo, String autor, Integer ano, Integer pagLivro) {
        super(titulo, autor, ano);
        this.pagLivro = pagLivro;
    }

    @Override
    public void exbirFichaCatalogoGrafica() {
        System.out.println(" ficha do livro");
        System.out.println(" titulo " + this.titulo);
        System.out.println(" autor" + this.autor);
        System.out.println(" Ano" + this.ano);
        System.out.println(" pagina" + this.pagLivro);

    }

    @Override
    public void resevar(Membro membro) {
        System.out.println(" O livro " + this.titulo + " foi reservado por " + membro.getNome());
    }}



