package aula_Herenca_2_ArenaDeBatalha;

public  class ArenaDeBatalha {
    public static void main(String[] args) {
        Heroi aragorn = new Heroi("Aragorn", 130, 15);
        Monstro orc = new Monstro("orc grunt", 70, 10, "golpe de clava");

        System.out.println("--- A batalha começa!---");
        aragorn.exibirStatus();
        orc.exibirStatus();
        System.out.println("--------------------------\n");

        int turno = 1;

        while (aragorn.estaVivo() && orc.estaVivo()){
            System.out.println(" -- Turno" + turno + "---");

            aragorn.atacar(orc);

            if (orc.estaVivo()){
                orc.atacar(aragorn);
            }
            if (aragorn.estaVivo() && aragorn.pontosDeVida < 40){
                System.out.println("\nVida do herói está baixa!");
                aragorn.usarPocao();
            }

            System.out.println("----------------------------\n");
            turno++;
        }

        System.out.println(" --- A batalha terminou! ---");
        if (aragorn.estaVivo()){
            System.out.println(aragorn.nome + "é o vencedor!");
        } else {
            System.out.println(orc.nome + " é o vencedor");
        }
        aragorn.exibirStatus();
        orc.exibirStatus();

    }

}