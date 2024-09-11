package desafios;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à Fibonacci");
        }
        else {
            System.out.println("O número " + numero + " NÃO pertence a Fibonacci");
        }


        sc.close();
    }

    public static boolean pertenceAFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == numero;
    }
}
