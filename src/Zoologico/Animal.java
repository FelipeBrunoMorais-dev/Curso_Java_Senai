package Zoologico;

public abstract class Animal {
    protected String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    // contratos: todo aninal precisa fazer barulho e se alimentar.
    public abstract void fazerBarulho();
    public abstract void alimentar();
}
