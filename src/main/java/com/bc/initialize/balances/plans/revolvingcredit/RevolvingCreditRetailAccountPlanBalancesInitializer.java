package com.bc.initialize.balances.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.balances.plans.AbstractBillingAccountBalancesInitializer;
import com.bc.initialize.balances.plans.BillingAccountPlanBalancesInitializer;

public class RevolvingCreditRetailAccountPlanBalancesInitializer extends AbstractBillingAccountBalancesInitializer {
    @Override
    public BillingAccountPlanBalancesInitializer initializePriorCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanBalancesInitializer initializeCurrentCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }
}
