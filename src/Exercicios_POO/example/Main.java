package Exercicios_POO.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Animal cachorro = new Cachorro("Doguinho");
        Animal gato = new gato("Gatinho");
        Animal vaca = new Vaca("Vaquinha");


        List<Animal> meusAninamis= new ArrayList<>();

        meusAninamis.add(cachorro);
        meusAninamis.add(gato);
        meusAninamis.add(vaca);

        System.out.println("Sistema Fazendinha");

        for (Animal animal: meusAninamis){
            animal.somAnimal();
        }

    }
}
