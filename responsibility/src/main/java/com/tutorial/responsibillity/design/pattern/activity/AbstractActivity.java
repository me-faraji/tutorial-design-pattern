package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.Command;

public abstract class AbstractActivity implements Command {
    ActivityModel model;
    @Override
    public Command preStep() {
        return null;
    }

    @Override
    public Command step() {
        return null;
    }

    @Override
    public Command nextStep() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }
}
