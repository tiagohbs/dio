package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int max=1;

        System.out.println("Digite um numero Inteiro para fatorar: ");
        num = scan.nextInt();
        System.out.println("Fatorial do número: " + num);
        for (int count = num ;count >=1; count--){
            //System.out.println(num +" X " + (count-1)+" = " + " " +  num * count );

            max = max * count;


        }
        System.out.println("Resultado: " + max);
    }
}
