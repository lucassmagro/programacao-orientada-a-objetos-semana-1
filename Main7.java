//7. Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius e converta-a para graus Fahrenheit.
//Além disso, o programa deve imprimir se está frio (abaixo de 32°F), moderado (entre 32°F e 80°F) ou quente (acima de 80°F).

/*
variáveis: c,f (double)
Entrada: c
Processamento: f = (9*c + 160)/5
saída: f
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //variaveis
        double c,f;

        //objetos
        Scanner scanner = new Scanner(System.in);

        //fazer a formatação do resultado em 1 ou 2 casas decimais
        DecimalFormat formator = new DecimalFormat("#0.0");

        //entrada
        System.out.println("Conversão de temperatura");
        System.out.println("Digite a temperatura em celsius: ");
        c = scanner.nextDouble();

        //processamento
        f = (9*c + 160)/5;

        //saída
        System.out.println("Temperatura em Fahrenheit: " + formator.format(f) + "°F");

        scanner.close();

        if (f <= 32) {
            System.out.println("Está frio.");
        } else if (f <= 80) {
            System.out.println("Está moderado.");
        } else {
            System.out.println("Está quente.");
        }
    }
}
