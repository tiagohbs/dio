package particular;
import java.util.Random;
import java.util.Scanner;
public class Ex6_ImparParVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max;
        System.out.println("Qual sera o tamanho do vetor?");
        max = scan.nextInt();
        Random random = new Random();
        int [] vetor = new int[max];
        int [] impar= new int[max];
        int [] par= new int[max];
        for (int i = 0; i < vetor.length ; i++){
            int numero = random.nextInt(1,60);
            vetor[i] = numero;
        }
        System.out.println("Números");
        for ( int numero : vetor   ) {
            System.out.print(numero+ " ");
        }
        for (int i = 0; i < impar.length;i++) {
            if(vetor [i] % 2 == 1){
               if (vetor[i] != 0){
                   impar [i] = vetor[i];
               }
        }
        }
        for (int i = 0; i < impar.length;i++) {
            if(vetor [i] % 2 == 1){
                //if (vetor[i] != 0) {
                impar[i] = vetor[i];//}
            }
        }
        for (int i = 0; i < par.length;i++) {
            if(vetor [i] % 2 == 0){
               if (vetor[i] != 0 ) {
                par[i] = vetor[i];
                }
            }
        }
        /*
        for (int i = 0; i < par.length;i++)
            if (par[i] == 0){
                par[i] = Integer.parseInt(".");
            }*/ //TENTATIVA DE REMOVER O ZERO
        System.out.println("\nNumero impares");
        for (int numero  : impar ) {
            if (numero != 0)
            System.out.print(numero + " ");
        }System.out.println("\nNumero pares");
        for (int numero  : par ) {
            if (numero != 0)
            System.out.print(numero + " ");
        }

    }
}
