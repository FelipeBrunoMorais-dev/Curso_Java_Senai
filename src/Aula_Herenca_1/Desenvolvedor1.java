package Aula_Herenca_1;

public class Desenvolvedor1 extends Funcionario1 {
    private String linguagem;

    public Desenvolvedor1(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar(){
        System.out.println("o Dev " + this.nome + " Está programando em " + this.linguagem + ".");
    }
}

