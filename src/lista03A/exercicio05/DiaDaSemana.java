package exercicio05;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner diaSemana = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = diaSemana.nextInt();
        switch (num){
            case 1:
                System.out.println("Você escolheu o nº 1 - Domingo");
                break;
            case 2:
                System.out.println("Você escolheu o nº 2 - Segunda-feira");
                break;
            case 3:
                System.out.println("Você escolheu o nº 3 - Terça-feira");
                break;
            case 4:
                System.out.println("Você escolheu o nº 4 - Quarta-feira");
                break;
            case 5:
                System.out.println("Você escolheu o nº 5 - Quinta-feira");
                break;
            case 6:
                System.out.println("Você escolheu o nº 6 - Sexta-feira");
                break;
            case 7:
                System.out.println("Você escolheu o nº 7 - Sábado");
                break;
            default:
                System.out.println("NÚMERO INVÁLIDO - O número escolhido não corresponde a nenhum dia da semana");
        }
    }
}
