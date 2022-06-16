package com.badger.factorypatterntesting;

public abstract class CreditService {
    public abstract String getScore();
    public abstract String getServiceType();

    @Override
    public String toString() {
        return "Your " + this.getServiceType() + " score is: " + this.getScore();
    }
}
