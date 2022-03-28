package curso.completo.secao.estrurura.secao04.aula26;

import java.util.Scanner;

public class aula26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char c = 'M';

        c = sc.next().charAt(0);
        z = sc.nextDouble();
        y = sc.nextInt();
        x = sc.next();

        System.out.println("Voce digitou: " + x);

        sc.close();

    }

}
