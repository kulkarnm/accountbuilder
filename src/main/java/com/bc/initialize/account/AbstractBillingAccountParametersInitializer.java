package com.bc.initialize.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountParametersInitializer implements AccountParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        this.initializeIdentityDefinition(product, billingAccount).
                initializeCustomerPreferencesAndUnits(product, billingAccount).
                initializeRuleParameters(product, billingAccount);
        return billingAccount;
    }
}
