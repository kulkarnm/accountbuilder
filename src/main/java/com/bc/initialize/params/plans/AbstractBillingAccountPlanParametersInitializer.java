package com.bc.initialize.params.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountPlanParametersInitializer implements BillingAccountPlanParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        this.initializeIdentityDefinition(product, oldBillingAccount,newBillingAccount ).
                initializeInterestRate(product, oldBillingAccount, newBillingAccount).
                initializeTransactionFee(product, oldBillingAccount,newBillingAccount ).
                initializeRuleParameters(product, oldBillingAccount,newBillingAccount );
        return oldBillingAccount;
    }
}
