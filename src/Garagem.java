import Henranca_carro.Bicicleta;
import Henranca_carro.Carro;
import Henranca_carro.Moto;

public class Garagem {
    public static void main (String[] args){
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);
        Moto minhaMoto = new Moto("Honda", "cb 500", 500);
        Bicicleta minhaBike = new Bicicleta("Oggi", "SPFC 500", "Carbono");

        System.out.println("--- Ações com o Carro");
        meuCarro.ligar(); // Metodo herdado de veiculo
        meuCarro.abrirPortaMala(); //Metodo especifico de carro
        meuCarro.desligar(); // metodo herdado de veiculo

        System.out.println("\n -- Ações com a Motocicleta ---");
        minhaMoto.ligar(); // metodo herdado de veiculo
        minhaMoto.empinar(); // metodo especifico de Motocicleta
        minhaMoto.desligar(); // metodo herdado de veiculo

        System.out.println("\n --- Ações com a Biclicleta ----");
        minhaBike.modelo();

    }
}
