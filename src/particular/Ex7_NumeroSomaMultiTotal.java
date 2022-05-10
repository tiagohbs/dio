package particular;

import java.util.Scanner;

public class Ex7_NumeroSomaMultiTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] num = new int[5];
        int soma=0,num2;
        float multi=1;
        int count = 0;
        do {
            System.out.println("Digite o numero: ");
            num2 = scan.nextInt();
            num[count] = num2;
            soma=soma+num2;
            multi = multi*num2;
            count++;
        }while(count < num.length);
        System.out.println("Números digitados:");
        for (int numero : num ) {
            System.out.print(numero+ ".");
        }
        System.out.println("\nMultiplicação: \n"+ multi );
        System.out.println("soma: \n"+ soma );
    }
}
