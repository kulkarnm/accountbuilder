package com.bc.initialize.params.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountPlanParametersInitializer implements BillingAccountPlanParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        this.initializeIdentityDefinition(product, billingAccount).
                initializeInterestRate(product, billingAccount).
                initializeTransactionFee(product, billingAccount).
                initializeRuleParameters(product, billingAccount);
        return billingAccount;
    }
}
