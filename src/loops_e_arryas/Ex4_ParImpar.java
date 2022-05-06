package loops_e_arryas;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int impar = 0;
        int par = 0;
        int count = 0; // sempre iniciar variável contadora de ciclos.
        int max;
        int num;
        System.out.println("Quantos números inteios usaremos? ");
        max = scan.nextInt(); // similar ao comando leia em C#, aqui ele ler o que é digitado e salva na variavel "max"
        do{
            System.out.println("Numero: ");
            num = scan.nextInt();
            if (num % 2 == 0 ) par++; // Aqui acontece a conferencia se o resto da divisão por 2 é igual a zero, se for "par" recebe +1
            else impar++; // aqui é o contrario do par, depois da negativa impar recebe +1.
            count++;// contador que adiciona +1 a  cada ciclo de execução. Que esta limitado pela pergunta inicial do codigo.
        } while (count < max); // limitador de ciclos
        System.out.println("Impares: "+ impar);
        System.out.println("Pares: "  + par);




    }
}
