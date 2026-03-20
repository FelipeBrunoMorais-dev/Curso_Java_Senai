package PersistenciaDeDados;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainAgenda {

    private static final AgendaManager manager = new AgendaManager("agenda.txt");
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Contato> agenda;

    public static void main(String[] args) {
        agenda = manager.carregarContatos();
        System.out.println("Bem-vindo a sua agenda de contatos Digital!");

        int opcao = 0;
        while ( opcao !=5){
            exibirMenu();
            if(scanner.hasNextInt()){
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar o buffer

                switch (opcao){
                    case 1: adicionarContato();break;
                    case 2: listarContato();break;
                    case 3: buscarContato();break;
                    case 4: removerContato();break;
                    case 5: System.out.println("salvando agenda e saindo...");break;
                    default:
                        System.out.println("opção inválida!"); break;                                       }
            }else {

                System.out.println(" por favor, digite um número");
                scanner.next();// descarta a entrada inválida
            }

        }

        manager.salvarContatos(agenda);
        System.out.println("agenda salva com sucesso. Até mais!");
        scanner.close();

    }

    private static void exibirMenu(){
        System.out.println("\n --- Agenda de contatos ----");
        System.out.println("1. Adicionar novo Contato");
        System.out.println("2. listar todos os contatos");
        System.out.println("3. Buscar contato por nome");
        System.out.println("4. remover Contato");
        System.out.println("5. sair e salvar");
        System.out.println("Escolha uma opção");
    }
    private static void adicionarContato(){
        System.out.println("\n --- adicionar contatos ---");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        // verifica se o nome já existe (Ignorando maisculas / minusculas)
        if (agenda.stream().anyMatch(contato -> contato.getNome().equalsIgnoreCase(nome))){
            System.out.println("Erro: já existe um contato com este nome.");
            return;
        }
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        agenda.add(new Contato(nome, telefone, email));
        System.out.println("Contato Adicionado com sucesso!");
    }

    private static void listarContato(){
        System.out.println("\n --- seus contatos ---");
        if (agenda.isEmpty()){
            System.out.println("nenhum contato na agenda.");
        } else {
            agenda.forEach(System.out::println);
        }
    }
    private static void buscarContato(){
        System.out.println("\n --- buscar contato---");
        System.out.println("Digite o nome ou parte do nome para Buscar: ");
        String termoBusca = scanner.nextLine().toLowerCase();

        List<Contato> resultados = agenda.stream()
                .filter(contato -> contato.getNome().toLowerCase().contains(termoBusca))
                .collect(Collectors.toList());
        if(resultados.isEmpty()){
            System.out.println("Nenhum contato encontrado com o termo '" + termoBusca + "'.");
        } else {
            System.out.println("Resultados da busca: ");
            resultados.forEach(System.out::println);
        }
    }
    private static void removerContato(){
        System.out.println("\n -- remover contato --");
        System.out.println("digite o nome exato do contato a ser removido: ");
        String nomeParaRemover = scanner.nextLine();
    }
}
