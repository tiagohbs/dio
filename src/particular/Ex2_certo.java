package particular;

import java.util.Scanner;

public class Ex2_certo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, somaM=0, maior=0, menor=10;
        int max;

        System.out.println("Quanta pessoa cadastraremos? ");
        max = scan.nextInt();

        for(int i= 0; i < max; i++){ // i inicia com 0, enquanto i for menor que max faça i+1
            System.out.println("Qual o sexo da pessoa? 1- Mulheres 2 - Homens. ");
            sexo= scan.nextInt();
            System.out.println("Qual a altura? ");
            altura = scan.nextFloat();
            if (sexo == 1){
                qtMulheres++;
                somaM = somaM+altura;
            }else if (sexo ==2){
                qtHomens++;
                somaH=somaH+altura;
            }else {
                System.out.println("Opção invalida");
            }
            if (altura > maior){
                maior = altura;
            }else if (altura < menor){
                menor=altura;
            }

        }
        float mediaH;
        mediaH = somaH / qtHomens;


        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaH + " m");
        System.out.println("O número de mulheres é " + qtMulheres);

        scan.close();

    }
}
