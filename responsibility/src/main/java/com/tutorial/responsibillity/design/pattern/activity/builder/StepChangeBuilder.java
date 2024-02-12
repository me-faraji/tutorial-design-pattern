package com.tutorial.responsibillity.design.pattern.activity.builder;

import com.tutorial.responsibillity.design.pattern.Command;
import com.tutorial.responsibillity.design.pattern.activity.impl.ActivityStepChange;

public class StepChangeBuilder implements CommandBuilder {
    ActivityStepChange command;
    public StepChangeBuilder() {
        command = new ActivityStepChange();
    }

    @Override
    public void reasonId(Long reasonId) {
        command.setReasonId(reasonId);
    }

    @Override
    public void stepChange(Integer stepChange) {
        command.setStepChange(stepChange);
    }

    @Override
    public void statusText(Integer statusText) {
        command.setStatusText(statusText);
    }

    @Override
    public Command build() {
        return command;
    }
}
