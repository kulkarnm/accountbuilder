package com.bc.initialize.balances.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.balances.BillingCycleBalancesInitializer;

public interface BillingAccountPlanBalancesInitializer extends BillingCycleBalancesInitializer {
    public BillingAccountPlanBalancesInitializer initializePriorCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount);
    public BillingAccountPlanBalancesInitializer initializeCurrentCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount);
}
