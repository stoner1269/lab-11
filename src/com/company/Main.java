package com.company;

public class Main {

    public static void main(String[] args) {
        LambdaSimple lam1 = new LambdaSimple();
        lam1.firstNum();
        LambdaOneParametr lam2 = new LambdaOneParametr();
        lam2.firstSqrt();
        LambdaTwoParametr lam3 = new LambdaTwoParametr();
        lam3.firstCompare();
        new LambdaBlock().firstOperation();


    }
}