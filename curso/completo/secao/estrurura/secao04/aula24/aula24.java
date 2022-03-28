package curso.completo.secao.estrurura.secao04.aula24;

import java.util.Locale;

public class aula24 {
    public static void main(String[] args) {

        int y =21;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(y);
        System.out.println(x);

        //Troca a localização para ser convertido de "," -> BR para "." -> US
        Locale.setDefault(Locale.US);

        //%.2f ->
        // Conta as casa decimais
        //%n -> Faz quebra de linha
        System.out.printf("%.2f%n", x);

        System.out.println("RESULTADO -> " + x + "METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        //%f -> Ponto flutuante
        //%d -> Inteiro
        //%s -> texto
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }

}
