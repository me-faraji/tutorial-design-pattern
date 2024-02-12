package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivityFailCommand;
import com.tutorial.responsibillity.design.pattern.command.ActivityStartCommand;
import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;

public class ActivityStart implements ActivityStartCommand {
    private ActivityModel model;

    @Override
    public ActivityStartCommand process(ActivityStrategy strategy) {
        return null;
    }

    @Override
    public ActivityStartCommand step() {
        return null;
    }

    @Override
    public ActivityStartCommand nextStep() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }

}
