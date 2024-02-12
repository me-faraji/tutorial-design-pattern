package com.tutorial.responsibillity.design.pattern.product;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.Command;

public class ProductPayment implements Command {
    ActivityFaced activityFaced;
    Command preStep  = new ProductOrder();
    Command nextStep = new ProductApprove();

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
