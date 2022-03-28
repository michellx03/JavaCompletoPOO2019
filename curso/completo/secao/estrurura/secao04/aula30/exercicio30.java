package curso.completo.secao.estrurura.secao04.aula30;

import java.util.Scanner;

public class exercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        //EXERCICO 01
        int dado1, dado2, soma;

        dado1 = sc.nextInt();
        dado2 = sc.nextInt();

        soma = dado1 + dado2;

        System.out.println("A soma e -> " + soma);

        //EXERCICIO 02
        double area;
        double raio;

        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2.0);

        System.out.printf("Area -> %.4f", area);

        //EXERCICIO 03
        int E, F, G, H;
        int diferenca;

        E = sc.nextInt();
        F = sc.nextInt();
        G = sc.nextInt();
        H = sc.nextInt();

        diferenca = (E * F) - (G * H);

        System.out.println("Diferença -> " + diferenca);

        //EXERCICIO 04
        int numero, hora;
        double valor_hora, salario;

        numero = sc.nextInt();
        hora = sc.nextInt();
        valor_hora = sc.nextDouble();

        salario = hora * valor_hora;

        System.out.println("NUMBER -> " + numero);
        System.out.printf("SALARY -> U$ %.2f", salario);

        //EXERCICIO 05
        int codigo_peca_1;
        int numero_peca_1;
        double valor_peca_1;

        int codigo_peca_2;
        int numero_peca_2;
        double valor_peca_2;

        double valor_total;

        codigo_peca_1 = sc.nextInt();
        numero_peca_1 = sc.nextInt();
        valor_peca_1 = sc.nextDouble();

        codigo_peca_2 = sc.nextInt();
        numero_peca_2 = sc.nextInt();
        valor_peca_2 = sc.nextDouble();

        valor_total = (numero_peca_1 * valor_peca_1) + (numero_peca_2 * valor_peca_2);

        System.out.println("Codigo dos produtos -> " + codigo_peca_1 + " " + codigo_peca_2);
        System.out.printf("Valor a pagar -> R$  %.2f",valor_total);

        //EXERCICIO 06
        double A, B, C;
        double area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        area_triangulo = (A * C) / 2.0;
        System.out.printf("TRIANGULO: %.3f%n", area_triangulo);

        area_circulo = pi * Math.pow(C, 2.0);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);

        area_trapezio = (A + B) * C / 2.0;
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);

        area_quadrado = Math.pow(B, 2.0);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);

        area_retangulo = A * B;
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);

    }

}
