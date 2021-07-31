package QuickSort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class LeitorDados{
    
    public static void ler(ArrayList<Integer> vetor){
        try{
            FileInputStream file = new FileInputStream("src/main/java/entrada/dados.txt");
            
            Scanner entrada = new Scanner(file);
            
            while(entrada.hasNext()){
                vetor.add(entrada.nextInt());
            }
            
        }catch(FileNotFoundException e){
            System.err.println("erro: arquivo de dados não encontrado.");
        }
    }
}
