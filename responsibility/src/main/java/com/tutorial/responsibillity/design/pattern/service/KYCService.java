package com.tutorial.responsibillity.design.pattern.service;

public interface KYCService {
    void start();
    void sendEmail();
    void reSendEmail();
    void verifyCode();
    void uploadDocument();
    void inquiryIdentity();
    void confirm();
}
