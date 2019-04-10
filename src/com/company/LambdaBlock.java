package com.company;

public class LambdaBlock {
    LamBlock operation;

    public void firstOperation() {
        operation = (int x, int y) -> {
            if (y < x)
                return 0;
            else
                return x + y;

        };
        System.out.println(operation.func(5, 7));

    }
}
