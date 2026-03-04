package Aula_Herenca_1;

public class Funcionario1 {

    protected String nome;
    protected double salario;

    public Funcionario1(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
     public void trabalhar(){
         System.out.println(this.nome + " Está trabalhando.");
        }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }
}
