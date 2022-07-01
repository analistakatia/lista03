package exercicio07;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        int total = 0;

        Scanner num = new Scanner(System.in);
        System.out.println("Número Primo - Sim ou Não?");

        System.out.print("Informe um número: ");
        int numero = num.nextInt();
        num.close();

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                total = total + 1;
            }
        }
        if (total == 2){
            System.out.println(numero + " é primo");
        }else {
            System.out.println(numero + " não é primo");
        }
    }
}
