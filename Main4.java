//4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14).
// Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”.

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para a tabuada: ");
        int n = scanner.nextInt();

        System.out.println("A tabudada de " + n + " é: ");
        for (int i = 1; i<11; i++) {
            System.out.println(n + " x " + i + " = " + n*i );
        }
        scanner.close();
    }
}