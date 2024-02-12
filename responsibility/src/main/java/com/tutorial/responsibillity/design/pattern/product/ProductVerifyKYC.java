package com.tutorial.responsibillity.design.pattern.product;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.Command;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import com.tutorial.responsibillity.design.pattern.ActivityModel;

public class ProductVerifyKYC implements Command {
    ActivityFaced activityFaced;
    Command preStep  = null;
    Command nextStep = new ProductUploadPassport();

    @Override
    public void process() {
        ActivityModel model = activityFaced.startActivity(ActivityStrategy.Product);
        //process
        activityFaced.changeStep(model.getId());
    }

    @Override
    public ActivityModel preStep() {
        return null;
    }

    @Override
    public ActivityModel step() {
        return null;
    }

    @Override
    public ActivityModel nextStep() {
        return null;
    }
}
