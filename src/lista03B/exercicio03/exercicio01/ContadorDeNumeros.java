package exercicio03.exercicio01;

public class ContadorDeNumeros {
    public static void main(String[] args) {
        System.out.println("=== Contagem de números pelo loop 'For' ===");
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        System.out.println("=== Contagem de números pelo loop 'While' ===");
        int i = 1;
        while (i <= 100){
            System.out.println(i++);
        }

    }
}
