package exercicio02;

import java.util.Scanner;

public class IndicacaoPrecoProduto {
    public static void main(String[] args) {
        System.out.println("==== Orçamento de Produtos ====");
        Scanner produtos = new Scanner(System.in);
        System.out.print("Digite o valor do Produto A: R$ ");
        double prodA = produtos.nextDouble();
        System.out.print("Digite o valor do Produto B: R$ ");
        double prodB = produtos.nextDouble();
        System.out.print("Digite o valor do Produto C: R$ ");
        double prodC = produtos.nextDouble();

        if (prodA < prodB && prodA < prodC){
            System.out.print("Compre o Produto A pois ele está com menor preço!");
        } else if (prodB < prodA && prodB < prodC) {
            System.out.print("Compre o Produto B pois ele está com menor preço!");
        }else {
            System.out.print("Compre o Produto C pois ele está com menor preço!");
        }


    }
}
