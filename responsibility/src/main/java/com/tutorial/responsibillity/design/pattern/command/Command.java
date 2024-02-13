package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;

public interface Command {
    Command process(ActivityStrategy strategy);
    Command process(Long id);
    Command process(Long id, Integer stepChange, String statusText);
    Command preStep();
    Command step();
    Command nextStep();
    ActivityModel getModel();
}
