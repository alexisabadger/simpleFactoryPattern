package com.badger.factorypatterntesting;

public class TransUnionService extends CreditService {

    // member variable
    private String score;
    private String serviceType = "TransUnion";

    // constructor
    public TransUnionService(String userScore) {
        this.score = userScore;
    }

    // no-arg constructor
    public TransUnionService() {
        this.score = "720";
    }

    @Override
    public String getScore() {
        return this.score;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }
}
