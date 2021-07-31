package ComparativoAlgoritmos;

import QuickSort.QuickSort;
import HeapSort.HeapSort;
import BucketSort.BucketSort;
import java.util.ArrayList;

/**
 *
 * @author v1ctor13
 */
public class Run {
    public static void main(String[] args){
        
        QuickSort qs = new QuickSort();
        HeapSort hs = new HeapSort();
        BucketSort bs = new BucketSort();
        
        ArrayList<Integer> vetorQs = new ArrayList<>();
        ArrayList<Integer> vetorHs = new ArrayList<>();
        ArrayList<Integer> vetorBs = new ArrayList<>();
        
        LeitorDados.ler(vetorQs);
        LeitorDados.ler(vetorHs);
        LeitorDados.ler(vetorBs);
        
        System.out.println("vetor não ordenado: " + vetorQs);
        System.out.println("vetor não ordenado: " + vetorHs);
        System.out.println("vetor não ordenado: " + vetorBs);
        
        System.out.printf("\n\n\n");
        
        long start, elapsedTime;
        
        // QUICK SORT
        start = System.nanoTime();
        
        qs.quickSort(vetorQs);
        
        elapsedTime = System.nanoTime() - start;
        
        System.out.println("tempo gasto QS: " + elapsedTime);
        System.out.println("vetor ordenado QS: " + vetorQs);
        
        // HEAP SORT
        start = System.nanoTime();
        
        hs.heapSort(vetorHs);
        
        elapsedTime = System.nanoTime() - start;
        
        System.out.println("tempo gasto HS: " + elapsedTime);
        System.out.println("vetor ordenado HS: " + vetorHs);
        
        // BUCKET SORT
        start = System.nanoTime();
        
        vetorBs = bs.bucketSort(vetorBs);
        
        elapsedTime = System.nanoTime() - start;
        
        System.out.println("tempo gasto BS: " + elapsedTime);
        System.out.println("vetor ordenado BS: " + vetorBs);
        
    }
}
