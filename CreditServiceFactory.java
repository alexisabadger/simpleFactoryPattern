package com.badger.factorypatterntesting;

import com.badger.factorypatterntesting.CreditService;
import com.badger.factorypatterntesting.EquifaxService;
import com.badger.factorypatterntesting.TransUnionService;
import com.badger.factorypatterntesting.ExperianService;

public class CreditServiceFactory {
    public static CreditService getCreditScore(int serviceType) {
        switch (serviceType) {
            case 1:
                return new EquifaxService();
            case 2:
                return new TransUnionService();
            case 3:
                return new ExperianService();
            default:
                return null;
        }
    }
}
