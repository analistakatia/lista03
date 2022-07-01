package exercicio06;

import java.util.Scanner;

public class SomaNumImpares {
    public static void main(String[] args) {
        int soma = 0;

        Scanner num = new Scanner(System.in);

        System.out.print("Informe o valor de início: ");
        int inicio = num.nextInt();
        System.out.print("Informe o valor final: ");
        int fim = num.nextInt();

        if (fim <= inicio){
            System.out.println("Número Inválido - O programa será encerrado pois o número digitado é inferior ao número de inicio do intervalo.");
            fim  = num.nextInt();
            System.exit(1);
        }
        num.close();

        for (int i = inicio; i <= fim; i++){
            if (i % 2 == 1){
                soma = soma + i;
            }
        }
        System.out.println("A soma dos valores ímpares dentro do intervalo foi: " + soma);
    }
}

