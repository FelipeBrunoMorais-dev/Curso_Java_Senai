package Exercicios_POO.example;

public class Vaca extends Animal{
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void somAnimal() {
        System.out.println(" Esse som e da " + this.getNome() + "faz muuu");

    }
}
