package arrays;

import java.security.SecureRandom;
import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosaleatorios = new int[6];
         for ( int i = 0 ; i < numerosaleatorios.length;i++){
             int numero = random.nextInt(60);
             numerosaleatorios[i] = numero;
        }
        System.out.println("Números Aleatórios");
        for  ( int numero       : numerosaleatorios       ) {
            System.out.print(numero + " ");
        }
        System.out.println("\nNúmeros sucessores");
        for ( int numero:numerosaleatorios  ) {
            System.out.print((numero+1)+ " ");
        }
        System.out.println("\nNúmeros Antecessores");
        for (int numero:numerosaleatorios ) {
            System.out.print((numero-1)+ " ");

        }
        System.out.println();
    }
}
