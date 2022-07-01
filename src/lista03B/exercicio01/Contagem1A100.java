package exercicio01;

public class Contagem1A100 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i <= 100; i++){
            System.out.println("Contagem 'For' " + i);
        }
        while (num <= 100){
            System.out.println("Contagem 'While' " + num);
            num++;
        }

    }
}
