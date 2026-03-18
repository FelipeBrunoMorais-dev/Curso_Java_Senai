package Exercicios_POO.example;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void somAnimal(){
        System.out.println(" Esse som e da " + this.getNome() + " faz au au");

    }
}

