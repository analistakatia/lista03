package exercicio03;

import java.util.Scanner;

public class ResultadoMediaAluno {
    public static void main(String[] args) {
        System.out.println("*** MÉDIA DE ALUNO ***");
        Scanner notas = new Scanner(System.in);
        System.out.print("Digite a 1ª nota: ");
        double nota1 = notas.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double nota2 = notas.nextDouble();

        double media = (nota1 + nota2)/ 2;

        if (media < 7){
            System.out.printf("O aluno atingiu a média de %.2f, portanto o aluno está REPROVADO", media);
        } else if (media >= 7 && media < 10) {
            System.out.printf("O aluno atingiu a média de %.2f, portanto o aluno está APROVADO", media);
        }else {
            System.out.printf("O aluno atingiu a média de %.2f, portanto o aluno está APROVADO COM DISTINÇÃO!", media);
        }
    }
}
