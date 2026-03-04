package Henranca_carro;
// Carro é um Veiculo, herdando marca, modelo, ligar() e Desligar()
public class Carro  extends Veiculo{
    private int numeroDePortas;


    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    public void abrirPortaMala(){
        System.out.println(" o Porta-malas do " + modelo + " foi aberto");
    }

}
