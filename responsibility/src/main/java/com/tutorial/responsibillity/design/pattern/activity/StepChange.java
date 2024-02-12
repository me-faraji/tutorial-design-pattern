package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivityChangeStepCommand;
import com.tutorial.responsibillity.design.pattern.command.Command;

public class StepChange implements ActivityChangeStepCommand {
    private ActivityModel model;
    @Override
    public ActivityChangeStepCommand process(long id) {
        return null;
    }

    @Override
    public ActivityChangeStepCommand preStep() {
        return null;
    }

    @Override
    public ActivityChangeStepCommand step() {
        return null;
    }

    @Override
    public ActivityChangeStepCommand nextStep() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }
}
