package com.bc.initialize.balances.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.balances.plans.BillingAccountPlanBalancesInitializer;

public abstract class AbstractBillingAccountBalancesInitializer implements BillingAccountBalancesInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount,BillingAccount newBillingAccount) {
        return this.initializeBalances(product, oldBillingAccount,newBillingAccount );
    }
}
