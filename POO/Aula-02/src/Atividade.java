package Aula02;
import java.util.Scanner;

public class Atividade {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String sobrenome = entrada.nextLine();
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();
        char InicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);
        System.out.printf("%s %s (%c.%c.) nasceu em %s/%s/%s", nome, sobrenome, InicialN, inicialS, dia, mes, ano);
    }
}
