
        // Exercício 2
package Aula02;

import java.util.Scanner;

public class Exercício2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira três números:");
        int Numero1 = input.nextInt();
        int Numero2 = input.nextInt();
        int Numero3 = input.nextInt();
        int Maior = 0;
        if (Numero1 > Numero2) {
            Maior = Numero2;
        } else if (Numero3 > Maior) {
            Maior = Numero3;
        }
        System.out.println("O maior número é " + Maior);

    }
}

