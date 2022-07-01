package exercicio04;

import java.util.Scanner;

public class SomaNumPositivos {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite a quantidade de números que você deseja inserir: ");
        int qtdNum = num.nextInt();

        for (int i = 0; i < qtdNum; i++) {
            System.out.print("Digite um número positivo: ");
            int numInf = num.nextInt();
            soma = soma + numInf;
        }
        num.close();
        System.out.println("A soma dos números informados é: " + soma);
    }
}

