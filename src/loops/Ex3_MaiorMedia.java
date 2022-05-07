package loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        float soma = 0;
        int max;
        System.out.println("Quantos números vc ira inserir? ");
        max = scan.nextInt();
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = numero + soma;
            count++;
        } while(count < max);
        System.out.println("O maior número foi o " + maior);
        System.out.println("Media: "+ soma/max);
    }
}
