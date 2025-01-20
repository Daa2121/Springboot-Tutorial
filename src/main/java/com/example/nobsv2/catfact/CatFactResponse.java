package com.example.nobsv2.catfact;


public class CatFactResponse {
    private String fact;
    private int length;

    public CatFactResponse() {
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public int getLength() {
        return length;
    }
}
