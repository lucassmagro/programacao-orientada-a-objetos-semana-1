//6. Crie um algoritmo em Java que solicita um número inteiro ao usuário.
//Em seguida, deve-se verificar se o número digitado é ou não é um número primo.
//Obs: número primo é divisível por 1 e por ele mesmo

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int n = scanner.nextInt();
            while (n < 1) {
                n = scanner.nextInt();
            }

            boolean primo = true;
            for( int i=2; i < n; i++){
                if (n % i == 0 ) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("Número primo");
            }  else {
                System.out.println("Não é número primo");
            }


        } catch (Exception e) {
            System.out.println("Falha :" + e.getMessage());
        }
    }
}