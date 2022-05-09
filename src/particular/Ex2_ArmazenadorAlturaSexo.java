package particular;

import java.util.Scanner;

public class Ex2_ArmazenadorAlturaSexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura = 0, maior = 0, menor= 10, somah = 0, somam=0;
        int man = 0,woman = 0, count=0, max;
        int sex;
        System.out.println("Quantas pessoas vai inserir? ");
        max = scan.nextInt();


        for ( int i = 1; i < max; i++) {
                    System.out.println("Digite o sexo 1-M ou 2-F: ");
                    sex = scan.nextInt();
                    System.out.println("Digite a altura: ");
            altura = scan.nextFloat();
                    if (altura > maior)
                        maior = altura;
                    if (altura < menor)
                        menor=altura;
                    if (sex== 1){
                        somah = altura + somah;
                        man++;
                    } else if(sex==2){
                        somam = altura = somam;
                        woman++;
                    } else System.out.println("Digite o sexo 1-M ou 2-F:");
                    sex = scan.nextInt();


            }

        System.out.println("A maior altura: " +maior);
        System.out.println("A menor altura: " +menor);
        System.out.println("Homens: "+man);
        System.out.println("Mulheres: "+woman);
        System.out.println("Média altura mulheres: "+somah/man);
        System.out.println("Média altura mulheres: "+somam/woman);



    }
}
