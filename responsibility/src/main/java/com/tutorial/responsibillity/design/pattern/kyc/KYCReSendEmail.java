package com.tutorial.responsibillity.design.pattern.kyc;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.Command;

public class KYCReSendEmail implements Command {
    ActivityFaced activityFaced;
    @Override
    //@ActivityStart(ActivityStrategy.KYC)
    //@ActivityChangeStep()
    public void process() {

    }
}
