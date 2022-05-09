package particular;

import java.util.Scanner;

public class Ex3_SalariosMediaVetorSimplesMelhorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        float numSalarios=0f;
        float [] valor = new float[4];
        do {
            System.out.println("Qual o valor do salário? ");
            float  valores = scan.nextFloat();
            valor [count] = valores;
            count++;
        } while (count < valor.length);
        System.out.println("valores: ");
        for (float salarios:valor
             ) {
            System.out.println(salarios + " ");
            numSalarios = numSalarios + salarios; // vai somar cada valor dos salários e armazenar
        }
        System.out.println("Média dos salários é: "+ numSalarios/4);
    }
}
