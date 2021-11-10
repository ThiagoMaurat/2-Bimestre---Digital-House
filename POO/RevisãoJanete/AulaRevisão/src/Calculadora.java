import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = 0;
        double num1,num2,resultado;
        num1=num2=resultado=0;
        do {
            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.println("Qual a operação desejada: 1:soma\n 2:subtração \n 3:multiplicação\n 4:divisão");
            x = scanner.nextInt();
            System.out.println("Digite o segundo número");
            num2 = scanner.nextDouble();
            if (x != 0) {
                 if (x == 1) {
                    resultado = num1 + num2;
                    System.out.println("O resultado da soma é: " + resultado);
                } else if (x == 2) {
                    resultado = num1 - num2;
                    System.out.println("O resultado da subtração é: " + resultado);
                } else if (x == 3) {
                    resultado = num1 * num2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                } else if (x == 4) {
                    resultado = num1 / num2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else if (x>4){
                    System.out.println("Operação inválida");
                }
            } 
            

        }
        while (x != 0);
        
    }
}

