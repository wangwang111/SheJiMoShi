package com.wang.cl;

public interface StrategyCondition {

    boolean support(int num);

    ModelStrategy getStrategy();

}
