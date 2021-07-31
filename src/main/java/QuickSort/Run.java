package QuickSort;

import Util.Pessoa;
import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args){
        
        QuickSort qs = new QuickSort();
        
        ArrayList<Integer> vetor = new ArrayList<>();
        
        
//        ArrayList<Pessoa> vetor = new ArrayList<>();
//        Pessoa p1 = new Pessoa(100, "victor");
//        Pessoa p2 = new Pessoa(101, "vinicius");
//        Pessoa p3 = new Pessoa(102, "silva");
//        Pessoa p4 = new Pessoa(103, "santos");
//        Pessoa p5 = new Pessoa(104, "guerra");
//
//        vetor.add(p4);
//        vetor.add(p2);
//        vetor.add(p5);
//        vetor.add(p1);
//        vetor.add(p3);

        LeitorDados.ler(vetor);
        
        System.out.println("vetor desordenado: \n" + vetor);
        
        long start = System.nanoTime();        
        
        qs.quickSort(vetor);
        
        long elapsedTime = System.nanoTime() - start;
        
        System.out.println("tempo gasto: " + elapsedTime);
        System.out.println("vetor ordenado: \n" + vetor);
        
    }
    
    public static void print(Object o){
        System.out.println(o);
    }
}


