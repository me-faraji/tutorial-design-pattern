package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public class ActivityChangeStepTo implements ActivityCommand {
    @Override
    public void process() {

    }

    @Override
    public ActivityModel preStep() {
        return null;
    }

    @Override
    public ActivityModel step() {
        return null;
    }

    @Override
    public ActivityModel nextStep() {
        return null;
    }
}
