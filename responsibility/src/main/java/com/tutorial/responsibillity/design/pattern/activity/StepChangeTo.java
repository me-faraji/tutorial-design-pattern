package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivityChangeStepCommand;
import com.tutorial.responsibillity.design.pattern.command.ActivityChangeStepToCommand;

public class StepChangeTo implements ActivityChangeStepToCommand {
    private ActivityModel model;

    @Override
    public ActivityChangeStepToCommand process(long id, int stepChange, String statusText) {
        return null;
    }

    @Override
    public ActivityChangeStepToCommand preStep() {
        return null;
    }

    @Override
    public ActivityChangeStepToCommand step() {
        return null;
    }

    @Override
    public ActivityChangeStepToCommand nextStep() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }
}
