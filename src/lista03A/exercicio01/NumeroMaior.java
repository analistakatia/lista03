package exercicio01;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = num.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = num.nextInt();

        if (numero1 > numero2){
            System.out.println("Dos dois números digitados, o número " +numero1 +" é o maior");
        }else {
            System.out.println("Dos dois números digitados, o número " +numero2 + " é o maior");
        }
    }
}
