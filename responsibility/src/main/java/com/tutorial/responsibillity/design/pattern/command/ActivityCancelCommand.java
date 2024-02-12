package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface ActivityCancelCommand {
    ActivityCancelCommand process(long id, String statusText);
    ActivityCancelCommand step();
    ActivityModel getModel();

}
