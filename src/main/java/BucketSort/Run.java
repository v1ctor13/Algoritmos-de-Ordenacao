package BucketSort;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args){
        
        BucketSort bs = new BucketSort();
        
        ArrayList<Integer> vet = new ArrayList<>();
        
        System.out.println(vet);
        
        LeitorDados.ler(vet);
        
        vet = bs.bucketSort(vet);
        
        System.out.println(vet);
        
    }
}
