package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        //int count= 0;// esse uso para for é errado
        int max;
        do {System.out.println("Digite um valor entre 1 e 10: ");
            num = scan.nextInt();
        } while (num < 0 || num > 10);
        System.out.println("Multiplicaremos até qual número? ");
        max = scan.nextInt();
        System.out.println("Tabuada de "+ num);
        for (int count = 0; count <= max;count++){ // contador limitador e "adicionador" são iniciados no inicio do for
            System.out.println(num +" X "+ count +" = " + num*count);
        }

    }
}
