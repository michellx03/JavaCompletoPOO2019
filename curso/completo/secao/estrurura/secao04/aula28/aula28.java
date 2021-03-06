package curso.completo.secao.estrurura.secao04.aula28;

public class aula28 {

    public static void main(String[] args) {

        //sqrt -> Raiz quadrada
        //pow -> Potenciação
        //abs -> Valor absoluto

        double x = 3.0;
        double y = 4.0;
        double k = 2.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        //FOMRULA DE BASKARA
        double delta = Math.pow(x, 2.0) - 4*y*k;

        double x1 = (-x + Math.sqrt(delta)) / (2.0 *y);
        double x2 = (-x - Math.sqrt(delta)) / (2.0 *y);




    }

}
