//1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
// Em seguida, a média destes números é calculada e mostrada na tela para o usuário.

import java.util.Scanner;
import java.util.Locale;

public class Main1 {
    public static void main (String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número decimal: ");
        Double numero1 =  scanner.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        Double numero2 =  scanner.nextDouble();

        System.out.print("Digite o terceiro número decimal: ");
        Double numero3 =  scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média destes números é = " + media);

        scanner.close();
    }
}
