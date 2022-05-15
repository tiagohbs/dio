package particular;

import java.util.Random;

public class Ex9_AleatorioStringsChar {
    public static void main(String[] args) {
        String letras = "fm";
        String sexo="";
        Random gerador = new Random();
        sexo += letras.charAt(gerador.nextInt(letras.length()));
        //ainda tenho que estudar mais esse método
        System.out.println(sexo);

    }
}
