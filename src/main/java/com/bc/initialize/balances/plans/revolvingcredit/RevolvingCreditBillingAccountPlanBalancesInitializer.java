package com.bc.initialize.balances.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.balances.plans.AccountPlanBalancesInitializer;

public class RevolvingCreditBillingAccountPlanBalancesInitializer implements AccountPlanBalancesInitializer {
    @Override
    public BillingAccount initializeBalances(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        return this.initializeBalances(product,billingAccount);
    }
}
