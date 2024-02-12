package com.tutorial.responsibillity.design.pattern.product;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.ActivityModel;
import com.tutorial.responsibillity.design.pattern.Command;
import com.tutorial.responsibillity.design.pattern.kyc.KYCVerifyCode;

public class ProductSave implements Command {
    ActivityFaced activityFaced;
    Command preStep  = null;
    Command nextStep = new KYCVerifyCode();

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
