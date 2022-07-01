package exercicio09;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner fat = new Scanner(System.in);

        //int resFatorial = 1;
        StringBuilder multiplicador = new StringBuilder();

        System.out.println("Insira um número para descobrir seu respectivo Fatorial: ");
        int fatorial = fat.nextInt();

        for (int i = fatorial; i > 1; i--) {
            fatorial *= i;
            multiplicador.append(i).append(" x ");
        }

        if (fatorial == 0) {
            System.out.println(fatorial + "! = " + fatorial);
        } else if (fatorial == 1) {
            System.out.println(fatorial + "! = " + fatorial);
        }
    }
}



