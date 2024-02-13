package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractCommand implements Command {
    private ActivityModel model;

    @Override
    public Command process(ActivityStrategy strategy) {
        return null;
    }

    @Override
    public Command process(Long id) {
        return null;
    }

    @Override
    public Command process(Long id, Integer stepChange, String statusText) {
        return null;
    }

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

    protected void setModel(ActivityModel model) {
        this.model = model;
    }
}
