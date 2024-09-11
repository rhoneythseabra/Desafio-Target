package desafios;

import java.util.Scanner;

public class VerificandoLetraA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = sc.nextLine();

        int quantidade = contadorDeA(texto);

        if (quantidade > 0) {
            System.out.println("A letra 'A' aparece " + quantidade + " vezes.");
        }
        else {
            System.out.println("A letra 'A' NÃO aparece na string.");
        }

        sc.close();
    }

    public static int contadorDeA(String texto) {
        int cont = 0;

        String textoLowerCase = texto.toLowerCase();

        for (int i = 0; i < textoLowerCase.length(); i++) {
            if (textoLowerCase.charAt(i) == 'a') {
                cont ++;
            }
        }

        return cont;
    }
}
