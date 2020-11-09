package com.wang.cl;

import java.util.ArrayList;
import java.util.List;

public class ModelStrategyContext {

    private List<StrategyCondition> strategyConditionList = new ArrayList<>();

    public ModelStrategyContext() {
        strategyConditionList.add(new StrategyConditionImpl_1());
        strategyConditionList.add(new StrategyConditionImpl_2());
    }

    public void execute(int num) {
        StrategyCondition strategyCondition = getStrategyCondition(num);
        strategyCondition.getStrategy().executeStrategy();
    }


    private StrategyCondition getStrategyCondition(int num) {
        for (int i = 0; i < strategyConditionList.size(); i++) {
            StrategyCondition strategyCondition = strategyConditionList.get(i);
            if (strategyCondition.support(num)) {
                return strategyCondition;
            }
        }
        return null;
    }
}
