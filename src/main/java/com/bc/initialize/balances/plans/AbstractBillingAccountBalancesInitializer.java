package com.bc.initialize.balances.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountBalancesInitializer implements BillingAccountPlanBalancesInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount,BillingAccount newBillingAccount) {
        this.initializePriorCycleBalances(product, oldBillingAccount,newBillingAccount ).
                initializeCurrentCycleBalances(product, oldBillingAccount,newBillingAccount );
        return newBillingAccount;
    }
}
