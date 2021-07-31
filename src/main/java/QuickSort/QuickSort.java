package QuickSort;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort<T extends Comparable>{
    
    public void quickSort(ArrayList<T> vetor){
        quickSort(vetor, 0, vetor.size() - 1);
    }
    
    private void quickSort(ArrayList<T> vetor, int esquerda, int direita){
        if(esquerda < direita + 1){
            int particaoIndex = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, particaoIndex - 1);
            quickSort(vetor, particaoIndex + 1, direita);
        }
    }
    
    private int particao(ArrayList<T> vetor, int esquerda, int direita){
        trocar(vetor, esquerda, criarPivot(esquerda, direita));
        int borda = esquerda + 1;
        for (int i = borda; i <= direita; i++) {
            if (vetor.get(i).compareTo(vetor.get(esquerda)) == -1){
                trocar(vetor, i, borda++);
            }
        }
        trocar(vetor, esquerda, borda - 1);
        return borda - 1;
    }
    
    private void trocar(ArrayList<T> vetor, int i, int j){
        T aux = vetor.get(i);
        vetor.set(i, vetor.get(j));
        vetor.set(j, aux);
    }
    
    private int criarPivot(int esquerda, int direita) {
        Random rand = new Random();
        return rand.nextInt((direita - esquerda) + 1) + esquerda;
    }
}
