package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface ActivityFailCommand {
    ActivityFailCommand process(long id, String statusText);
    ActivityFailCommand step();
    ActivityModel getModel();

}
