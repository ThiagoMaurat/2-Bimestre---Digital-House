
        // Exercício 1
package Aula02;
import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args) {
        int Armazenar;
        int divisores = 0;
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número maior do que zero: ");
        Armazenar = tec.nextInt();

        for(int i=1; i<=Armazenar; i++){
            if (Armazenar % i == 0) {
                divisores++;
            }
        }

        if (divisores >2) {
            System.out.println("Número não primo");
        } else {
            System.out.println("Número primo");
        }
    }

}
