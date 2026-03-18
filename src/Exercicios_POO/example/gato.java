package Exercicios_POO.example;

public class gato extends Animal {

    public gato(String nome) {
        super(nome);
    }

    @Override
    public void somAnimal(){
        System.out.println(" Esse som é da " + this.getNome() + " faz miau");

    }
}
