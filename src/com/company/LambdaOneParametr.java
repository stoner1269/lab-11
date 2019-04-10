package com.company;
import java.lang.Math;
public class LambdaOneParametr {
    LamOneParam sqrt;
    public void firstSqrt() {
        sqrt = (a) -> Math.sqrt(a);
        System.out.println ("Корень  = " + sqrt.ans(225));
    }

}
