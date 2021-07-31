package Util;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int id;
    
    public Pessoa(int id, String nome){
        this.nome = nome;
        this.id = id;
    }
    
    public Pessoa(int id){
        this.nome = "";
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "" + this.getId();
    }
    
    @Override
    public boolean equals(Object p){
        if(!(p instanceof Pessoa)) return false;
        else return this.getId() == ((Pessoa)p).getId();
    }

    @Override
    public int compareTo(Pessoa p){
        if(this.getId() < p.getId()){
            return -1;
        }
        else if(this.getId() == p.getId()){
            return 0;
        }
        else{
            return 1;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
