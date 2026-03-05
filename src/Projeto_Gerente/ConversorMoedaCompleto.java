import java.util.Scanner;

public class ConversorMoedaCompleto {

    // 1. Tabelas de referência (Dicionários)
    private static final String[] UNIDADES = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private static final String[] DEZENAS = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    private static final String[] CENTENAS = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor (ex: 125.50): ");
        String entrada = sc.next(); // Lê como String para usar o split

        // 2. Divisão do número em Reais e Centavos
        String[] partes = entrada.split("\\.");
        int reais = Integer.parseInt(partes[0]);
        int centavos = (partes.length > 1) ? Integer.parseInt(partes[1]) : 0;

        // 3. Construção da frase final
        String resultado = "";

        if (reais > 0) {
            resultado += escrever(reais) + (reais == 1 ? " real" : " reais");
        }

        if (centavos > 0) {
            if (reais > 0) resultado += " e ";
            resultado += escrever(centavos) + (centavos == 1 ? " centavo" : " centavos");
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }

    // 4. Função recursiva que transforma o número em texto
    public static String escrever(int n) {
        if (n == 100) return "cem";
        if (n < 20) return UNIDADES[n];
        if (n < 100) return DEZENAS[n / 10] + (n % 10 != 0 ? " e " + UNIDADES[n % 10] : "");

        return CENTENAS[n / 100] + (n % 100 != 0 ? " e " + escrever(n % 100) : "");
    }
}