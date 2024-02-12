package com.tutorial.responsibillity.design.pattern;

public interface Command {
    Command process();
    Command preStep();
    Command step();
    Command nextStep();
    ActivityModel getModel();

}
