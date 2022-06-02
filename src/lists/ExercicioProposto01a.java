package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while(true){
            if (count == 6) break;
            System.out.println("Digite a temperatura");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
        }
        System.out.println("-------------------");

        System.out.println("Todas as temperaturas");
        temperaturas.forEach(t -> System.out.println(t+""));

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.printf("\n Média de temperaturas: %1.f \n", media);


        System.out.println("Temperaturas acima da média");
        temperaturas.stream()
                .filter(t ->t> media)
                .forEach(t-> System.out.printf("%.1f", t));

        System.out.println("\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()){
            Double temp = iterator.next();
            if (temp>media){
                switch (count){
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);// printf usado libera o uso da virgula
                    case (1):
                        System.out.println("2 - fevereiro %.1f\n" + temp);
                    case (2):
                        System.out.println("3 - março %.1f\n");
                    case (3):
                        System.out.println("4 - abril %.1f\n");
                    case (4):
                        System.out.println("5 - maio %.1f\n");
                    case (5):
                        System.out.println("6 - junho %.1f\n");
                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }
        }
    }
}
