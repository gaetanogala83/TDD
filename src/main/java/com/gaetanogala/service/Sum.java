package com.gaetanogala.service;

public class Sum {

    private Integer valoreInteroA,
                    valoreInteroB;


    public Sum(){
        valoreInteroA = -1;
        valoreInteroB = -1;
    }

    public void setValoreInteroA(Integer valoreInteroA) {

        this.valoreInteroA = valoreInteroA;
    }

    public Integer getValoreInteroA() {

        return valoreInteroA;
    }

    public void setValoreInteroB(Integer valoreInteroB) {

        this.valoreInteroB = valoreInteroB;
    }

    public Integer getValoreInteroB() {

        return  valoreInteroB;
    }

    public Integer sumIntegerValues() throws Exception{

        if(valoreInteroA >=0 && valoreInteroB >=0)
            return valoreInteroA+valoreInteroB;

        throw new Exception("La classe SUM non è stat inizializzata!");
    }
}
