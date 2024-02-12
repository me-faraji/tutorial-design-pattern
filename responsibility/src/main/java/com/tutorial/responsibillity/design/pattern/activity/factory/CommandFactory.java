package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;

public abstract class CommandFactory {
    public Command create() {
        return init();
    }
    protected abstract Command init();
}
