package Exercicios_POO.example;

public abstract class Animal {

    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

      public  void somAnimal(){
        System.out.println(" Esse som é da " + nome);
    };

}
