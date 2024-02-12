package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.ActivityFail;

public class ActivityFailFactory extends CommandFactory {
    @Override
    public Command init() {
        return new ActivityFail();
    }
}
