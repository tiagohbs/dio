package particular;

import java.util.Scanner;

public class Ex4_TamanhoAzulejosParedeMelhorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float hp,lp, ha,la, div;
        float multP,multA; // multiplicação area da parede e area azulejos.
        System.out.println("Altura parede: ");
        hp = scan.nextFloat();
        System.out.println("Largura parede: ");
        lp = scan.nextFloat();
        multP = hp * lp;
        System.out.println("Altura Azulejo: ");
        ha = scan.nextFloat();
        System.out.println("Largura Azulejos");
        la = scan.nextFloat();
        multA = ha * la;
        div = multP/multA;
        System.out.println("Serão necessários "+ div + " azulejos para completar a área desta parede!" );
    }
}
