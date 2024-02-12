package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface ActivityChangeStepToCommand {
    ActivityChangeStepToCommand process(long id, int stepChange, String statusText);
    ActivityChangeStepToCommand preStep();
    ActivityChangeStepToCommand step();
    ActivityChangeStepToCommand nextStep();
    ActivityModel getModel();

}
