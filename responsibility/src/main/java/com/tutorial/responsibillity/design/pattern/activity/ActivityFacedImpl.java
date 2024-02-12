package com.tutorial.responsibillity.design.pattern.activity;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import com.tutorial.responsibillity.design.pattern.ActivityModel;

public class ActivityFacedImpl implements ActivityFaced {

    @Override
    public ActivityModel startActivity(ActivityStrategy strategy) {
        return null;
    }

    @Override
    public ActivityModel changeStep(Long reasonId) {
        return null;
    }

    @Override
    public ActivityModel changeStep(Long reasonId, Integer stepChange, String statusText) {
        return null;
    }

    @Override
    public ActivityModel successfulActivity(Long reasonId) {
        return null;
    }

    @Override
    public ActivityModel successfulActivity(Long reasonId, String statusText) {
        return null;
    }

    @Override
    public ActivityModel failActivity(Long reasonId) {
        return null;
    }

    @Override
    public ActivityModel failActivity(Long reasonId, String statusText) {
        return null;
    }

    @Override
    public ActivityModel cancelActivity(Long reasonId) {
        return null;
    }

    @Override
    public ActivityModel cancelActivity(Long reasonId, String statusText) {
        return null;
    }
}
