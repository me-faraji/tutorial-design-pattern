package com.tutorial.responsibillity.design.pattern.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.StepChange;
import lombok.Getter;
import lombok.Setter;

public class StepChangeFactory extends CommandFactory {
    @Override
    public Command init() {
        return new StepChange();
    }
}
