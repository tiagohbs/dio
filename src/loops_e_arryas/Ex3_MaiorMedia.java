package loops_e_arryas;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

        } while(count < 5) ;


    }
}
