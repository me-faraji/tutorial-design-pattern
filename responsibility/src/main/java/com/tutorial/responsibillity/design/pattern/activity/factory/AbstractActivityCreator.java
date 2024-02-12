package com.tutorial.responsibillity.design.pattern.activity.factory;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import lombok.Setter;

public abstract class AbstractActivityCreator {
    @Setter
    private ActivityStrategy strategy;
    @Setter
    private long id;
    @Setter
    private int stepChange;
    @Setter
    private String statusText;
    public abstract Command createStartCommand();
    public abstract Command createChangeStepCommand();
    public abstract Command createActivitySuccessCommand();
    public abstract Command createActivityFailCommand();
    public abstract Command createActivityCancelCommand();
}
