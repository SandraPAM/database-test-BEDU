package org.bedu;

public class Prodcut {
    private long id;

    private String name;


    public Product(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        rturn id;
    }

    public void setId(long id){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}