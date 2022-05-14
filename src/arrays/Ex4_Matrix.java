package arrays;
import java.util.Random;
public class Ex4_Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        int [][]m =new int[4][4];
        //int menor=0, maior=0;
        for  (int i=0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                m[i][j] = random.nextInt(9);
                 //menor =m[i][j];
            }
        }
        System.out.println("Matris: ");
        for ( int []linha:m  ) {
            for (  int coluna:linha  ) {
                System.out.print(coluna);
            }
            System.out.println();
        }
    }
}
