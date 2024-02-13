package com.tutorial.responsibillity.design.pattern.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.ActivityCancel;

public class ActivityCancelFactory extends CommandFactory {
    @Override
    public Command init() {
        return new ActivityCancel();
    }
}
