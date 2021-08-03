package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class LeitorDados{
    
    public static class operacoes{
    
        public static void ler(ArrayList<Integer> vetor){
            try{
                FileInputStream file = new FileInputStream("src/main/java/entrada/dados.txt");

                Scanner entrada = new Scanner(file);

                while(entrada.hasNext()){
                    vetor.add(entrada.nextInt());
                }

            }catch(FileNotFoundException e){
                System.err.println("erro: arquivo de dados n�o encontrado.");
            }
        }

        public static void escreverAleatorio() throws IOException{
            Random rand = new Random();
            int n;
            FileWriter file;
            file = new FileWriter("src/main/java/entrada/dados.txt");
            PrintWriter pw = new PrintWriter(file);

            for(int i = 0; i < 100000; i++){
                n = rand.nextInt(5000);
                n += 1;
                System.out.println(n);

                try{
                    pw.println(n);

                }catch(Exception e){
                    System.err.println("n�o foi poss�vel escrever no arquivo: " + e);
                }
            }

            file.close();
        }
    }
}
    