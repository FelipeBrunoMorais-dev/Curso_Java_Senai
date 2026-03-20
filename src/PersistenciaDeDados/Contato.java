package PersistenciaDeDados;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return String.format("Nome: %20s | Telefone: %-15s | Email: %s", nome, telefone, email);
    }
    /*
    converter o objeto contato para uma linha de texto para ser salva no arquivo.
    usaremos um separador que raramene aparece em nomes ou email, como
     */
    public String paraLinhaArquivo(){
        return String.format("%s|%s|%s", nome, telefone,email); // Formatação de caracteres
    }
    /*
    metodo estatico para criar um objeto contato partir de uma linha do arquivo.
         */
    public static Contato daLinhaArquivo(String linha){
        String [] partes = linha.split("\\|"); // expressão regular para separador
        if (partes.length == 3){
            return new Contato(partes[0], partes[1], partes[2]);
        }
        return null // retorna null se a linha estiver mal formatada
    }
}
