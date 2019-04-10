package com.company;

public class LambdaTwoParametr {
    LamTwoParam compare;

    public void firstCompare() {
        compare = (a, b) -> (a > b);
        if (compare.test(9, 4))
            System.out.println("Первое число больше второго");
        if (compare.test(2, 7))
            System.out.println("Второе число больше первого");
    }
}
