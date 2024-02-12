package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivitySuccessCommand;
import com.tutorial.responsibillity.design.pattern.command.Command;

public class ActivitySuccess implements ActivitySuccessCommand {
    private ActivityModel model;
    @Override
    public ActivitySuccessCommand process(long id, String statusText) {
        return null;
    }

    @Override
    public ActivitySuccessCommand step() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }
}
