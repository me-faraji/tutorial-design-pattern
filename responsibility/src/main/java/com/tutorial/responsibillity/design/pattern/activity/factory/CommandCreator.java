package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;

public class CommandCreator extends AbstractActivityCreator {

    @Override
    public Command createStartCommand() {
        return null;
    }

    @Override
    public Command createChangeStepCommand() {
        return null;
    }

    @Override
    public Command createActivitySuccessCommand() {
        return null;
    }

    @Override
    public Command createActivityFailCommand() {
        return null;
    }

    @Override
    public Command createActivityCancelCommand() {
        return null;
    }
}
