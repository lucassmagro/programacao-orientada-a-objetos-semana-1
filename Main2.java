//2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.

import java.util.Scanner;

public class Main2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else if (numero == 0) {
            System.out.println("O número é zero.");
        }

        scanner.close();

    }
    }