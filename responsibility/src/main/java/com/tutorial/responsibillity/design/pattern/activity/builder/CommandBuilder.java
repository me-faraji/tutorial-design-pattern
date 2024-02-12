package com.tutorial.responsibillity.design.pattern.activity.builder;

import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.Command;

public interface CommandBuilder {
    void reasonId(Long reasonId);
    void stepChange(Integer stepChange);
    void statusText(Integer statusText);
    Command build();
}
