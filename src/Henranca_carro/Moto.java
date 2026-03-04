package Henranca_carro;

public class Moto extends Veiculo {
    private int clilindradas;

    public Moto(String marca, String modelo, int clilindradas) {
        super(marca, modelo);
        this.clilindradas = clilindradas;
    }

    public void empinar(){
        System.out.println("A moto " + modelo + " de " + clilindradas + "cc está empinando! (com segurança!)*");
    }
}
