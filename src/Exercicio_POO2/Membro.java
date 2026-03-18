package Exercicio_POO2;

public class Membro {

    private String nome;
    private Integer numIdent;

    public Membro(String nome, Integer numIdent) {
        this.nome = nome;
        this.numIdent = numIdent;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumIdent() {
        return numIdent;
    }
}
