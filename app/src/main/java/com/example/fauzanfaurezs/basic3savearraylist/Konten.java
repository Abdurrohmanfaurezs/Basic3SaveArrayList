package com.example.fauzanfaurezs.basic3savearraylist;

public class Konten {
    //todo class ini berguna untuk menampung atau menyimpan data array (Model)
    private String data;


    public String getData(){
        return  data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String toString(){
        return (getData());
    }
}
