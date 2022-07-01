package exercicio08;

public class SomaImpares {
    public static void main(String[] args) {
        int tot = 0;
        int soma = 0;
        int impar = 0;

        while (tot <= 50){

            if (impar % 2 == 1){
                System.out.println(impar + " é um número impar");
                tot++;
                soma = soma + impar;
            }
            impar++;
        }
        System.out.println("A soma dos 50 números impares é " + soma);
    }
}
