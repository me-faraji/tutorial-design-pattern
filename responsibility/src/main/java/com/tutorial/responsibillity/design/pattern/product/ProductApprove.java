package com.tutorial.responsibillity.design.pattern.product;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.Command;

public class ProductApprove implements Command {
    ActivityFaced activityFaced;
    Command preStep  = new ProductPayment();
    Command nextStep = new ProductPrepare();

    @Override
    public void process() {
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
