package com.tutorial.responsibillity.design.pattern.product;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.Command;
import com.tutorial.responsibillity.design.pattern.ActivityModel;

public class ProductUploadPassport implements Command {
    ActivityFaced activityFaced;
    Command preStep  = new ProductVerifyKYC();
    Command nextStep = new ProductOrder();

    @Override
    public void process() {
        //process
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
