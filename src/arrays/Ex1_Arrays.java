package arrays;

public class Ex1_Arrays {
    public static void main(String[] args) {
        int[] vetor = {-5,-6,15,50,8,4};
        int count =0;
        int count1 = 0;
        //System.out.println(vetor.length);
        System.out.println("Vetor: ");
        while ( count <= (vetor.length-1)) {
            System.out.print(vetor[count]+ " ");
            count++;
        }
        System.out.println("\nVetor: ");
        for ( int i = (vetor.length-1); i >= 0 ; i --){
            System.out.print(vetor[i]+" ");

        }
        System.out.println("\nvetor: ");
        while (count1 < (vetor.length)) {
            System.out.print(vetor[count1]+" ");
            count1++;
        }
    }
}
