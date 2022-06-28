package exercicio04;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.print("Informe o valor de seu salário: R$ ");
        double salarioantigo = salario.nextDouble();

        if (salarioantigo <= 280){
            double aumento20 = (salarioantigo * 20)/100;
            double salAum20 = salarioantigo + aumento20;
            System.out.print("Salário anterior: R$ " +salarioantigo+ "\nPercentual de aumento: 20% \nValor do aumento: R$ " + aumento20 + "\nNovo salário: R$ " + salAum20);
        } else if (salarioantigo > 280 && salarioantigo <= 700) {
            double aumento15 = (salarioantigo * 15)/100;
            double salAum15 = salarioantigo + aumento15;
            System.out.print("Salário anterior: R$ " +salarioantigo+ "\nPercentual de aumento: 15% \nValor do aumento: R$ " + aumento15 + "\nNovo salário: R$ " + salAum15);
        } else if (salarioantigo > 700 && salarioantigo <= 1500) {
            double aumento10 = (salarioantigo * 10)/100;
            double salAum10 = salarioantigo + aumento10;
            System.out.print("Salário anterior: R$ " +salarioantigo+ "\nPercentual de aumento: 10% \nValor do aumento: R$ " + aumento10 + "\nNovo salário: R$ " + salAum10);
        }else {
            double aumento5 = (salarioantigo * 5)/100;
            double salAum5 = salarioantigo + aumento5;
            System.out.print("Salário anterior: R$ " +salarioantigo+ "\nPercentual de aumento: 5% \nValor do aumento: R$ " + aumento5 + "\nNovo salário: R$ " + salAum5);
        }
    }
}
