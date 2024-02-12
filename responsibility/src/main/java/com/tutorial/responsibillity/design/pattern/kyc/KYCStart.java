package com.tutorial.responsibillity.design.pattern.kyc;

import com.tutorial.responsibillity.design.pattern.ActivityFaced;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import com.tutorial.responsibillity.design.pattern.ActivityModel;

public class KYCStart implements KYCService {
    ActivityFaced activityFaced;

    @Override
    //@ActivityStart(ActivityStrategy.KYC)
    //@ActivityChangeStep()
    public void process() {
        ActivityModel model = activityFaced.startActivity(ActivityStrategy.KYC);
        //process
        activityFaced.changeStep(model.getId());
    }

}
