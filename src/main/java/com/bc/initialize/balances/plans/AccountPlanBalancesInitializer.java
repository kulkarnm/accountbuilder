package com.bc.initialize.balances.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface AccountPlanBalancesInitializer extends BillingCycleInitializer {
    public BillingAccount initializeBalances(Product product,BillingAccount billingAccount);
}
