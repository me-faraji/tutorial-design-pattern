package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.command.ActivityCancelCommand;
import com.tutorial.responsibillity.design.pattern.command.Command;

public class ActivityCancel implements ActivityCancelCommand {
    private ActivityModel model;

    @Override
    public ActivityCancelCommand process(long id, String statusText) {
        return null;
    }

    @Override
    public ActivityCancelCommand step() {
        return null;
    }

    @Override
    public ActivityModel getModel() {
        return model;
    }
}
