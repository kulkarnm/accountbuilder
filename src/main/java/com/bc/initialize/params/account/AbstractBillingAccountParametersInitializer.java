package com.bc.initialize.params.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountParametersInitializer implements BillingAccountParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        this.initializeIdentityDefinition(product, oldBillingAccount,newBillingAccount ).
                initializeCustomerPreferencesAndLimits(product, oldBillingAccount,newBillingAccount ).
                initializeRuleParameters(product, oldBillingAccount,newBillingAccount );
        return oldBillingAccount;
    }
}
