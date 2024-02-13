package com.tutorial.responsibillity.design.pattern.service;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.enums.ActivityStrategy;
import com.tutorial.responsibillity.design.pattern.factory.*;

public class KYCServiceImpl implements KYCService {
    @Override
    public void start() {
        CommandFactory factory = new ActivityStartFactory();
        Command command = factory.create();
        Command process = command.process(ActivityStrategy.KYC);
        // bis
    }

    @Override
    public void sendEmail() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process(1367L, 25, "expire code");
        Command process2 = command.process(1367L);
    }

    @Override
    public void reSendEmail() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process(1367L);
    }

    @Override
    public void verifyCode() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process(1367L);
    }

    @Override
    public void uploadDocument() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process(1367L);
    }

    @Override
    public void inquiryIdentity() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process(1367L);
    }

    @Override
    public void confirm() {
        CommandFactory successFactory = new ActivitySuccessFactory();
        Command successCommand = successFactory.create();
        Command successProcess = successCommand.process(1367L);
        //----
        CommandFactory failFactory = new ActivityFailFactory();
        Command failCommand = failFactory.create();
        Command failProcess = failCommand.process(1367L);
    }
}
