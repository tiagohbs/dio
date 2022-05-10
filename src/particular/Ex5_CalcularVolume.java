package particular;

import java.util.Scanner;

public class Ex5_CalcularVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v,r,a;
        int garrafas;

        System.out.println("Altura: ");
        a = scan.nextFloat();
        System.out.println("Raio");
        r = scan.nextFloat();
        v = 3.14159 * r * r * a;
        System.out.println("O volume é de : "+ v+" m3");



    }
}
