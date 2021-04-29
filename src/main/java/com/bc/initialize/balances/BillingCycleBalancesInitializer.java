package com.bc.initialize.balances;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public interface BillingCycleBalancesInitializer {
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount,BillingAccount newBillingAccount);

}
