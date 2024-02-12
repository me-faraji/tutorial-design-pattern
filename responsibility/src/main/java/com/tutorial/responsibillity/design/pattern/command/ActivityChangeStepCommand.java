package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface ActivityChangeStepCommand {
    ActivityChangeStepCommand process(long id);
    ActivityChangeStepCommand preStep();
    ActivityChangeStepCommand step();
    ActivityChangeStepCommand nextStep();
    ActivityModel getModel();

}
