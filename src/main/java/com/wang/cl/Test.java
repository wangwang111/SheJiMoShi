package com.wang.cl;

public class Test {
    public static void main(String[] args) {
        int mum = 5;
        // 0 --100 执行策略二   100 -200 执行策略一
        ModelStrategyContext modelStrategyContext = new ModelStrategyContext();
        modelStrategyContext.execute(5);
    }
}
