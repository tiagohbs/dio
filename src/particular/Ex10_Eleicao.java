package particular;

import java.util.Random;
import java.util.Scanner;

public class Ex10_Eleicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int eleitores,voto;
        int a=0,b=0,c=0,count=0;

        System.out.println("Quantos eleitores existem: ");
        eleitores = scan.nextInt();
        do {
            voto = random.nextInt(3);
            if (voto == 1){
                a++;
                }
            else if (voto == 2){
                b++;
            }
            else {
                c++;
                }
            count++;
        }while (count < eleitores);
        System.out.print("\nCandidato A: "+(a*100)/eleitores+"%"+" no total: "+a+" votos");
        System.out.print("\nCandidato B: "+(b*100)/eleitores+"%"+" no total: "+b+" votos");
        System.out.print("\nCandidato C: "+(c*100)/eleitores+"%"+" no total: "+c+" votos");





}
}



