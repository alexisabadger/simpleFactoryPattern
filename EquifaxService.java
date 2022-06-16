package com.badger.factorypatterntesting;

public class EquifaxService extends CreditService {

    // member variable
    private String score;
    private String serviceType = "Equifax";

    // constructor
    public EquifaxService(String userScore) {
        this.score = userScore;
    }

    // no-arg constructor
    public EquifaxService() {
        this.score = "650";
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
