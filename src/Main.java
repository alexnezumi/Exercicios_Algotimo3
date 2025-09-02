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

    }
}