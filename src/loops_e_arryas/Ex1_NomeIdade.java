package loops_e_arryas;

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String nome;
            int idade;
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");;
            idade = scan.nextInt();

        }
    }

}
