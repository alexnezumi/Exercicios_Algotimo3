import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exercicio 1 - Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma
        //estrutura sequencial e uma estrutura de repetição while.
    /*
        int x = 1;
        while(x <= 11){
            System.out.println(x + " Hello World!");
            x = x + 1;
        }
     */

        // exercicio 2 - Escrever um programa para exibir os números pares de 1 até 50 na tela.

     /*
     int x = 1;

     while (x <= 50 ){
         if (x % 2 == 0){
             System.out.println(x);
         }
        x++;
     }
      */

        // exercicio 3 -Crie um programa para ler 3 notas e mostrar a média delas.

    /*
     Scanner grava = new Scanner(System.in);
    double media, nota = 0, x;
    int menu = 1;
    int quant = 0;

    while (menu == 1)
    {
        System.out.println("Insira a nota");
        x = grava.nextDouble();
        nota = x + nota;
        quant++;

        System.out.println("Deseja inserir mais alguma nota ? 1/sim 2/não");
        menu = grava.nextInt();
    }
    media = nota/quant;
        System.out.println("A média das notas digitadas são " + media);
     */

        //exercico 4 - Escreva um programa com um looping indeterminado com while em que enquanto o
        //usuário não pedir para o programa sair, ele continua printando um contador na tela.

    /*
    Scanner grava = new Scanner(System.in);
    int menu = 1, num = 0;

        while (menu == 1){
            System.out.println(num);
            num++;
            System.out.println("Deseja continuar? 1/sim 2/não");
            menu = grava.nextInt();
        }
     */
        //exercicio 5 - Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar
        //um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número
        //novamente. Se digitar correto mostrar o número digitado.

      /*
        Scanner grava = new Scanner(System.in);
        int num, x = 1;
        while (x == 1) {

        System.out.println("Insira um numero");
        num = grava.nextInt();

            if (num >= 12 && num <= 20)
            {
                System.out.println("Voce inseriu o numero " + num + " e ele entra na condição");
                x++;
            }else{
                System.out.println("Entrada inválida, insira novamente");
            }

        }
       */

     // exercicio 6 - Usando o laço while para pedir ao usuário que tente acertar um número aleatório
        //entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas. Dica: Usar o
        //comando Random numero = new Random();









     // exercicio 7 - O usuário vai digitar uma nota válida (de 0 até 10). O programa deverá armazenar
        //estas notas em um acumulador. Usar uma segunda variável para contar quantas notas
        //foram armazenadas. Ao final, quando o usuário não quiser mais lançar notas, ele pede
        //para sair e o programa imprime na tela a média das notas

        Scanner grava = new Scanner(System.in);
        double media, nota = 0, x;
        int menu = 1;
        int quant = 0;

        while (menu == 1)
        {
            System.out.println("Insira a nota");
            x = grava.nextDouble();
            if (x >= 0 && x <= 10) {
                nota = x + nota;
                quant++;

                System.out.println("Deseja inserir mais alguma nota ? 1/sim 2/não");
                menu = grava.nextInt();

            }else {
                System.out.println("Insira uma nota valida que seja de 0 a 10");
            }
        }
        media = nota/quant;
        System.out.println("A média das notas digitadas são " + media);
    }
}