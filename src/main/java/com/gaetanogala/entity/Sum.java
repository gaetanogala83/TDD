package com.gaetanogala.entity;

public class Sum {

    private int a, b;


    public Sum(){
        a = -129;
        b = -129;
    }

    public int getA(){

        return a;
    }

    public void setA(int a){

        this.a = a;
    }

    public void setB(int b) {

        this.b = b;
    }

    public int getB() {

        return b;
    }

    public int sum() throws Exception{

        if(a==-129 || b==-129)
            throw new Exception();

        return a+b;
    }
}
