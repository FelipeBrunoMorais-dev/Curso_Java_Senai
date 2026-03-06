package Polimorfismo_Calculadora;

public class Circulo extends Figura{
    private double raio;

    public Circulo (Double raio){
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        // A classe Math usa a constante PI para fazer o calculo da Area
    return  Math.PI * raio + raio;
    }

}
