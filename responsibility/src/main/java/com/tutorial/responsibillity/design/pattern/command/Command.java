package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface Command {
    Command process();
    Command preStep();
    Command step();
    Command nextStep();
    ActivityModel getModel();

}
