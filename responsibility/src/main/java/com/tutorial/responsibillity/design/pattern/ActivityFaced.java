package com.tutorial.responsibillity.design.pattern;

import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;

public interface ActivityFaced {
    ActivityModel startActivity(ActivityStrategy strategy);
    ActivityModel changeStep(Long reasonId);
    ActivityModel changeStep(Long reasonId, Integer stepChange, String statusText);
    ActivityModel successfulActivity(Long reasonId);
    ActivityModel successfulActivity(Long reasonId, String statusText);
    ActivityModel failActivity(Long reasonId);
    ActivityModel failActivity(Long reasonId, String statusText);
    ActivityModel cancelActivity(Long reasonId);
    ActivityModel cancelActivity(Long reasonId, String statusText);
}
