package com.tutorial.responsibillity.design.pattern.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.ActivitySuccess;

public class ActivitySuccessFactory extends CommandFactory {
    @Override
    public Command init() {
        return new ActivitySuccess();
    }
}
