package com.wang.cl;

public class StrategyConditionImpl_1 implements StrategyCondition {
    @Override
    public boolean support(int num) {
        if (num > 100 && num < 200) {
            return true;

        }
        return false;
    }

    @Override
    public ModelStrategy getStrategy() {
        return new ModelStrategyImpl_1();
    }
}
