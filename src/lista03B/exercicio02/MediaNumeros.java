package exercicio02;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Informe quantos números você quer ter a média calculada: ");
        int qtdnum = num.nextInt();
        int soma = 0;

        for (int i = 0; i < qtdnum; i++) {
            System.out.println("Digite os números até que a quantidade informada seja completada: ");
            int numInformado = num.nextInt();

            soma = soma + numInformado;
        }
        num.close();

        double media = soma / qtdnum;

        System.out.println("Você escolheu " + qtdnum + " de números para informar");
        System.out.println("A soma desses números é: " + soma);
        System.out.printf("A média desses números é: %.2f", media);
    }
}

