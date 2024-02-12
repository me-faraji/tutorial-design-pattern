package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.StepChange;

public class StepChangeFactory extends CommandFactory {
    @Override
    public Command init() {
        return new StepChange();
    }
}
