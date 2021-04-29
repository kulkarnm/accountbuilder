package com.bc.initialize.balances.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.balances.BillingCycleBalancesInitializer;

public interface AccountBalancesInitializer extends BillingCycleBalancesInitializer {
    public BillingAccount initializeBalances(Product product,BillingAccount oldBillingAccount,BillingAccount newBillingAccount);
}
