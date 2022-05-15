package particular;

import java.util.Random;
import java.util.Scanner;

public class Ex8_CadastroValidado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random= new Random();
        String civ="",nome,sexo="";
        int idade,count=0,max;
        float sal;
        System.out.println("Início do programa");
        System.out.println("Quantas pessoas: ");
        max= scan.nextInt();
        String letras = "fm";//strings do genero
        String letras2="scvd";//strings do estado civil
        Random gerador = new Random();// aleatorio para letras

        do {
            do {
                System.out.println("Digite um nome: ");
                nome = scan.next();
            } while (nome.length() <= 3);
            do {
                //System.out.println("Qual a idade: ");
                //idade = scan.nextInt();
                idade = random.nextInt(1,149); //aleatorio para idade
            } while (idade <= 0 || idade >= 150);
            do {
                //System.out.println("Qual o salário: ");
                //sal = scan.nextFloat();
                sal = random.nextFloat(1280,9999999);//aleatorio para salario
            } while (sal <= 0);
            do {
                //System.out.println("Qual o gênero: f ou m ");
                //sexo = scan.next();
                sexo += letras.charAt(gerador.nextInt(letras.length()));// aleatorio dentro das opçoes da variavel string letra

            } while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
            do {
                //System.out.println("Qual o estado civil: s,c,v,d");
                //civ = scan.next();
                civ += letras2.charAt(gerador.nextInt(letras2.length()));

            } while (!civ.equalsIgnoreCase("c") &&
                    !civ.equalsIgnoreCase("s") &&
                    !civ.equalsIgnoreCase("v") &&
                    !civ.equalsIgnoreCase("d"));
            //saida
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: " + sal);
            System.out.println("Gênero: " + sexo);
            System.out.println("Estado civil: " + civ);
            count++;
        }while (count < max);
        System.out.println("Fim");
    }
}
