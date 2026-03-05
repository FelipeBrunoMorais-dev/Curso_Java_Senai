package Polimorfismo_impressao;

public class Foto extends Documento {
    public Foto (String nome) {super(nome);}

    @Override
    public void imprimir (){
        System.out.println("imprimindo Foto: '" + nome + "' em lt resolução a papel fotográfico.");

    }

}
