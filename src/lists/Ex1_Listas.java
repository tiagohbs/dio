package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex1_Listas {
    public static void main(String[] args) {
        System.out.println("Crie uma lista com o comando da aula");

        List <Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5.0d);
        notas.add(7.0d);
        notas.add(0.0d);
        notas.add(3.6d);
        System.out.println("Lista \n"+notas);
        System.out.println("Exiba a nota da posição 5.0 "+ notas.indexOf(5d));
        System.out.println("Adicione na lista  a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);
        System.out.println("Confira se o numero 5 esta na lista: "+notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));// listas começãm na posição 0
        System.out.println(notas);
        System.out.println("Exiba o menor valor: "+ Collections.min(notas));
        System.out.println("Exiba o maior valor: "+Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba o valor da soma: "+soma);
        System.out.println("Exiba a média: "+(soma/notas.size()));
        System.out.println("Remova a nota 0d: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Remova o elemento na pocição 0: ");
        notas.remove(0);
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("Remova os valores menores que 7d");
        System.out.println(notas);
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("Verificar se a lista esta vazia: "+notas.isEmpty());

    }
}
