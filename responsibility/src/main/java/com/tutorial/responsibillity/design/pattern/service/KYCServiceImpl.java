package com.tutorial.responsibillity.design.pattern.service;

import com.tutorial.responsibillity.design.pattern.command.Command;
import com.tutorial.responsibillity.design.pattern.activity.factory.*;

public class KYCServiceImpl implements KYCService {
    @Override
    public void start() {
        CommandFactory factory = new ActivityStartFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void sendEmail() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void reSendEmail() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void verifyCode() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void uploadDocument() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void inquiryIdentity() {
        CommandFactory factory = new StepChangeFactory();
        Command command = factory.create();
        Command process = command.process();
    }

    @Override
    public void confirm() {
        CommandFactory successFactory = new ActivitySuccessFactory();
        Command successCommand = successFactory.create();
        Command process = successCommand.process();
        //----
        CommandFactory failFactory = new ActivityFailFactory();
        Command failCommand = failFactory.create();
        Command failProcess = failCommand.process();
    }
}
