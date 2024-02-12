package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivityCancelCommand;
import com.tutorial.responsibillity.design.pattern.command.ActivityFailCommand;
import com.tutorial.responsibillity.design.pattern.command.Command;

public class ActivityFail implements ActivityFailCommand {
    private ActivityModel model;

    @Override
    public ActivityFailCommand process(long id, String statusText) {
        return null;
    }

    @Override
    public ActivityFailCommand step() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }

}
