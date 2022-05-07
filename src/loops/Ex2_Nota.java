package loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        int resp;

        while (true){
            System.out.println("Digite uma nota entre 1 e 10: ");
            nota = scan.nextInt();
            while (nota < 0 || nota > 10 ){
                System.out.println("Valor invalido, digite novamente: ");
                nota = scan.nextInt();
            }
            System.out.println("Deseja continuar? 1- Sim 2-Não: ");
            resp = scan.nextInt();
            if (resp == 2) break;
        }
        System.out.println("Obrigado... Mané S2");

    }
}
