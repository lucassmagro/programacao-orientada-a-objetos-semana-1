/*8. Desenvolva um algoritmo em Java que peça ao usuário um número inteiro n e gere um padrão de asteriscos.
     Por exemplo, se n for 5, o padrão seria assim:

        *

        **

        ***

        ****

        *****
*/

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para gerar o padrão de asteríscos: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}