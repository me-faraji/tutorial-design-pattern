package com.tutorial.responsibillity.design.pattern.command;

import com.tutorial.responsibillity.design.pattern.ActivityModel;

public interface ActivitySuccessCommand {
    ActivitySuccessCommand process(long id, String statusText);
    ActivitySuccessCommand step();
    ActivityModel getModel();

}
