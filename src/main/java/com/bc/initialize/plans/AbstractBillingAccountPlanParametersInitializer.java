package com.bc.initialize.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.account.AccountParametersInitializer;

public abstract class AbstractBillingAccountPlanParametersInitializer implements BillingAccountPlanParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        this.initializeIdentityDefinition(product, billingAccount).
                initializeCustomerPreferencesAndUnits(product, billingAccount).
                initializeRuleParameters(product, billingAccount);
        return billingAccount;
    }
}
