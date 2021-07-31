package BucketSort;

import java.util.ArrayList;

public class BucketSort<T extends Comparable>{
    
    public ArrayList<T> bucketSort(ArrayList<T> vet){
        // encontrando maior e menor
        T maior = vet.get(0);
        for(T i : vet){
            if(i.compareTo(maior) ==  1) maior = i;
        }
        
        int qntBaldes = 26;
        ArrayList<T>[] baldes;
        baldes = new ArrayList[qntBaldes];
        
        //divisor
        final int divisor;
        divisor = 193;
        
        int j;
        
        for(T i : vet){
            j = (int) Math.floor((int)i / divisor);
            if(baldes[j] == null){
                baldes[j] = new ArrayList<>();
                baldes[j].add(i);
            }
            else{
                baldes[j].add(i);
            }
        }
        
        ordenarBaldes(baldes);
        
        ArrayList<T> baldesJuntos;
        
        baldesJuntos = juntarBaldes(baldes);
        
        return baldesJuntos;
    }
    
    private void ordenarBaldes(ArrayList<T>[] baldes){
        //insertion Sort
        for(ArrayList<T> i : baldes){
            T aux;
            int x;
            for(int j = 1; j < i.size(); j++){
                x = j;
                while((i.get(x).compareTo(i.get(x - 1)) == -1 || i.get(x).compareTo(i.get(x - 1)) == 0)){
                    aux = i.get(x - 1);
                    i.set(x - 1, i.get(x));
                    i.set(x, aux);
                    if(x == 1) break;
                    x--;
                }
            }
        }
    }
    
    private ArrayList<T> juntarBaldes(ArrayList<T>[] baldes){
        ArrayList<T> baldesJuntos = new ArrayList<>();
        
        for(ArrayList<T> i : baldes){
            for(T j : i){
                baldesJuntos.add(j);
            }
        }
        
        return baldesJuntos;
    }
}
