package com.wang.cl;

public class StrategyConditionImpl_2 implements StrategyCondition {

    @Override
    public boolean support(int num) {
        if (num > 0 && num < 100) {
            return true;

        }
        return false;
    }

    @Override
    public ModelStrategy getStrategy() {
        return new ModelStrategyImpl_2();
    }
}
