package com.bc.initialize.balances.fees;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface AccountFeeBalancesInitializer extends BillingCycleInitializer {
    public BillingAccount initializeBalances(Product product,BillingAccount billingAccount);
}
