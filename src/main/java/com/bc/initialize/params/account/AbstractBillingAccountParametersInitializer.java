package com.bc.initialize.params.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountParametersInitializer implements BillingAccountParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        this.initializeIdentityDefinition(product, billingAccount).
                initializeCustomerPreferencesAndLimits(product, billingAccount).
                initializeRuleParameters(product, billingAccount);
        return billingAccount;
    }
}
