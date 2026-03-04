package Polimorfismo_DispositivoDeMidia;

//Esta é uma classe abstrata. Ela serve como um "Contrato" ou molde.
// não podemos criar um objeto "New DispositivoDeMidia()"
// Ela define o que todo dispositivo de midia deve ter.

public abstract class DispositivoDeMidia {

    protected String nomeDoDispositivo;

    public DispositivoDeMidia(String nome){
        this.nomeDoDispositivo = nome;
    }

//Este é um metodo abstrato. Ele não tem implementação (Sem {})
// Ele Força todas as classes filhas a criarem sua propria versão
// do metodo 'Reproduzir()'. Este e o nosso "Botão play" Conceitual.

public abstract void reproduzir();

    // classes abstratas também podem ter metodos concretos (Com implementação),
    // que seão herdados normalmente por todas as filhas.

  public void desligar(){
      System.out.println(this.nomeDoDispositivo + " está desligando");
  }
}
