package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import lombok.Setter;

public abstract class AbstractActivityCreator {

    public abstract Command createStartCommand(ActivityStrategy strategy);
    public abstract Command createChangeStepCommand(long id);
    public abstract Command createChangeStepToCommand(long id, int stepChange, String statusText);
    public abstract Command createActivitySuccessCommand(long id);
    public abstract Command createActivityFailCommand(long id, String statusText);
    public abstract Command createActivityCancelCommand(long id, String statusText);
}
