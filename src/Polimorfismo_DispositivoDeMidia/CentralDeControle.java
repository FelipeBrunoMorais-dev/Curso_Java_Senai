package Polimorfismo_DispositivoDeMidia;

public class CentralDeControle {
    // Este é o nosso "Botão Play" polimórfico.
    // Ele aceita qualquer objeto que seja um DispositivoDeMidia.

   public void apertarPlay(DispositivoDeMidia dispositivo){
       System.out.println(" Conectando ao dispositivo: " + dispositivo.nomeDoDispositivo);
       // O Java se encarrega de chamar a versão Correta do metodo reproduzir();
       // dependendo da forma real do objeto (TV, celular ou radio).

       dispositivo.reproduzir();
       System.out.println("---");
   }

   public static void main (String[] args){
       //criando a nossa central de controle.
       CentralDeControle controle = new CentralDeControle();

       //criando os objeto com duas formas especificas.
       SmartTV tvDaSala = new SmartTV("Tv da sala", "matrix");
       Celular meuCelular = new Celular("iphone 15", "stairway to heaven", "çed zeppelin");
       RadioAutomotivo radioDoCarro = new RadioAutomotivo("Rádio do Carro", 98.9);
        VideoGame game = new VideoGame("Console","Play 5");
       // USANDO O POLIMORFIMO;
       // o mesmo metodo 'apertarPlay' é chamdo com obejtos de tipos diferentes
       // e cada um se comporta de sua própria maneira.
       controle.apertarPlay(tvDaSala);
       controle.apertarPlay(meuCelular);
       controle.apertarPlay(radioDoCarro);
       controle.apertarPlay(game);


       System.out.println("\n--- Demonstrativo com um Lista de Dispositivo ---");

       // cirando uma lista que pode guardar QUALQUER DispositivoDeMidia.

       DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro};

       // usando o for-each para apertar o play em todos os dispositivos da lista.

       for (DispositivoDeMidia dispositivo: meusDispositivos){
           // a cada volta, o Java identifica a forma e chama o metodo certo!
           dispositivo.reproduzir();
       }

   }

}
