package com.company;

public class LambdaSimple {
    LamSimple newLamSimple;

    public void firstNum() {
        newLamSimple = () -> 15/3*(4-3+1);
        System.out.println("Ответ:" + newLamSimple.num() );
    }
}
