package com.bc.initialize.balances.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface AccountBalancesInitializer extends BillingCycleInitializer {
    public BillingAccount initializeBalances(Product product,BillingAccount billingAccount);
}
