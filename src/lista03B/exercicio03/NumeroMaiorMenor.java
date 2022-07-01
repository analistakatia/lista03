package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroMaiorMenor {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num[] = new int[10];
        int menorNum = Integer.MAX_VALUE;
        int maiorNum = num[0];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = numero.nextInt();
            if (num[i] > maiorNum) {
                maiorNum = num[i];
            }
        }
        for (int j = 0; j < num.length; j++) {
            if (num[j] < menorNum) {
                menorNum = num[j];
            }
        }
        numero.close();
        System.out.println("O maior número digitado foi: " + maiorNum);
        System.out.println("O menor número digitado foi: " + menorNum);
    }
}

