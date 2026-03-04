package Henranca_carro;

public class Bicicleta extends Veiculo{
    private String quadro;

    public Bicicleta(String marca, String modelo, String quadro) {
        super(marca, modelo);
        this.quadro = quadro;
    }

    public void modelo(){
        System.out.println("A bicicleta da marca " + marca + " de modelo" + modelo + " do tipo" + quadro +" é legal");
    }

}
