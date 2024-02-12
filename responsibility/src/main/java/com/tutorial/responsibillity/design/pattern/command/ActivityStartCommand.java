package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;

public interface ActivityStartCommand {
    ActivityStartCommand process(ActivityStrategy strategy);
    ActivityStartCommand preStep();
    ActivityStartCommand step();
    ActivityStartCommand nextStep();
    ActivityModel getModel();

}
