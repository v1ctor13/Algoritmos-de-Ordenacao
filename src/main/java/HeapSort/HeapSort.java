package HeapSort;

import java.util.ArrayList;

public class HeapSort<T extends Comparable> {
    
    public void heapSort(ArrayList<T> vet){
        int tam = vet.size();
        
        
        for(int i  = tam/2 - 1; i >= 0; i--){
            heapify(vet, tam, i);
        }

        // heap sort
        for(int i = tam - 1; i >= 0; i--){
            T aux = vet.get(0);
            vet.set(0, vet.get(i));
            vet.set(i, aux);
            // heapfica a raiz
            heapify(vet, i, 0);
        }
    }

    private void heapify(ArrayList<T> vet, int tam, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;
        
        if (esq < tam && vet.get(esq).compareTo(vet.get(maior)) == 1){
            maior = esq;
        }
        
        if (dir < tam && vet.get(dir).compareTo(vet.get(maior)) == 1 )
          maior = dir;

        
        if (maior != i) {
          T trocar = vet.get(i);
          vet.set(i, vet.get(maior));
          vet.set(maior, trocar);
          heapify(vet, tam, maior);
        }
    }
}
