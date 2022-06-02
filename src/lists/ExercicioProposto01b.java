package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<>();

        double soma = 0d;

        for ( int i = 1; i <= 6;i++){
            System.out.println("Qual a temperatura do mês "+i+": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma+=temp;
            
        }
        double mediaTemperaturaSemestral= soma/temperaturasSemestral.size();

        System.out.println("Temperaturas Semestral: "+temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: "+mediaTemperaturaSemestral);
        System.out.println("-----------------------------------");
        for (Double temp : temperaturasSemestral){
            if (temp>mediaTemperaturaSemestral){
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0 -> System.out.println((index + 1) + "- JANEIRO: " + temp + " oC");
                    case 1 -> System.out.println((index + 1) + "- FEVEREIRO: " + temp + " oC");
                    case 2 -> System.out.println((index + 1) + "- MARÇO: " + temp + " oC");
                    case 3 -> System.out.println((index + 1) + "- ABRIL: " + temp + " oC");
                    case 4 -> System.out.println((index + 1) + "- MAIO: " + temp + " oC");
                    case 5 -> System.out.println((index + 1) + "- JUNHO: " + temp + " oC");
                    default -> {
                    }
                }
            }
        }


    }
}
