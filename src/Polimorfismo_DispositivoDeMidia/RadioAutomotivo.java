package Polimorfismo_DispositivoDeMidia;

public class RadioAutomotivo extends DispositivoDeMidia{

    private double estacaoAtualFM;

    public RadioAutomotivo(String nome, double estacaoAtualFM) {
        super(nome);
        this.estacaoAtualFM = estacaoAtualFM;
    }
    @Override
    public  void reproduzir(){
        System.out.println("O " +this.nomeDoDispositivo + " está sintonizado na estação de rádio FM " + this.estacaoAtualFM + ".");

    }
}
