package Aula_Herenca_1;

public class Empresa {
    public static void main(String[] args){
        //criando um objeto Gerente
        Gerente1 gerente = new Gerente1("Felipe Morais", 7500.0, "financeiro");

        //criando o objeto Desenvolvedor
        Desenvolvedor1 dev = new Desenvolvedor1("João costa", 5000.0, "java");

        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + gerente.getNome()); // metodo herdado de funcionario
        gerente.trabalhar(); // metodo herdado de funcionario
        gerente.aprovaVerba(); // metodo especifico de Gerente

        System.out.println("\n ---Dados do Desenvolvedor---");
        System.out.println(" Nome: " + dev.getNome()); // meteodo herdado de funcionario
        dev.trabalhar(); // meteodo herdado de funcionario
        dev.programar(); // metodo especifico de desenvolvedor


    }
}
