package com.badger.factorypatterntesting;

public class ExperianService extends CreditService {

    // member variable
    private String score;
    private String serviceType = "Experian";

    // constructor
    public ExperianService(String userScore) {
        this.score = userScore;
    }

    // no-arg constructor
    public ExperianService() {
        this.score = "620";
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

