package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.Command;
import lombok.Getter;
import lombok.Setter;

public abstract class ActivityAbstract implements Command {
    @Getter
    @Setter
    public Long reasonId;
    @Getter
    @Setter
    public Integer stepChange;
    @Getter
    @Setter
    public Integer statusText;
    private ActivityModel model;

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
