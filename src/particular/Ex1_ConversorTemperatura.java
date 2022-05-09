package particular;

import java.util.Scanner;

public class Ex1_ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c, k, re, ra, fa;
        System.out.println("Digite um valor em Celsius: ");
        c = scan.nextInt();

        k = c + 273.15;
        fa = c * 1.8 + 32;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;

        System.out.println(c + " Celsius equivale a " + k +      " Kelvins ");
        System.out.println(c + " Celsius equivale a " + fa + " Fahrenheits ");
        System.out.println(c + " Celsius equivale a " + re +    " Réaumurs ");
        System.out.println(c + " Celsius equivale a " + ra +    " Rankines ");

    }
}
