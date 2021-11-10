// Exercício
//Na clínica veterinária, há diferentes tipos de cães. Cada um deles come uma
//quantidade fixa de alimentos balanceados por dia. O provedor de alimentos envia
//a você um pacote com diferentes quantidades de alimentos. Em cada um há
//envelopes com pequenas porções para serem consumidas a cada dia, sabendo-se
//que devem dar no mínimo 3 kg por dia para que cada cão não sinta fome e ladre a
//noite toda.
//Precisamos fazer um programa que nos ajude a simular a situação: primeiro
//perguntará o nome e a quantidade de comida que o cachorro come e por meio de
//uma função chamada quantosPacotes, retorne o nome e quantos pacotes ele
//usará por dia. Dada a quantidade necessária, a função quantosPacotes pedirá um
//a um os pesos de cada pacote, até atingir aquela quantidade dada como parâmetro
//da função.
//Exemplo:
//Rintintin come 4 kg diários.
//Pacotes: 1.2 0.7 1.1 1.3
//Resultado: Rintintin precisa de 4 pacotes.
import java.util.Locale;
import java.util.Scanner;

public class Aula3 {
// Modificadores de acesso: public -> Pode ser acessado dentro e fora da classe private -> Pode ser acessado apenas
// pela classe protected -> Pode ser acessado pela classe, outras classes no mesmo package e subclasses que herdaram
// a classe por herança

    public static int quantPacotes(float quantidade){
        float kilo = 0.0f;
        Scanner entrada2 = new Scanner(System.in);
        entrada2.useLocale(Locale.US);
        int cont=0;
        while(kilo < quantidade) {
            System.out.println("Digite o peso do pacote");
            float pacote = entrada2.nextFloat();
            kilo = kilo + pacote;
            cont++;
        }
        return cont;
    }


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do cachorrinho");
        String nome = entrada.nextLine();
        System.out.println("Digite a quantidade da ração");

        //opção1
        //String quantAux = entrada.nextLine();
        //float quantidade = Float.parseFloat(quantAux);

        //opção2
        entrada.useLocale(Locale.US);
        float quantidade = entrada.nextFloat();
        System.out.println("Você vai precisar de " + quantPacotes(quantidade) + " pacotes");
    }
}
