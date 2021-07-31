package HeapSort;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args){
        HeapSort<Integer> hs = new HeapSort<>();
        
        ArrayList<Integer> vetor = new ArrayList<>();
        
        LeitorDados.ler(vetor);
        
        System.out.println("vetor não ordenado: " + vetor);
        
        long start = System.nanoTime();

        hs.heapSort(vetor);
        
        long elapsedTime = System.nanoTime() - start;
        
        System.out.println("tempo gasto: " + elapsedTime);
        System.out.println("vetor ordenado: " + vetor);
        
    }
}
