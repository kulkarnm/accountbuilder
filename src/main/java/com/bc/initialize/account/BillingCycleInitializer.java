package com.bc.initialize.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public interface BillingCycleInitializer {
    public BillingAccount initialize(Product product, BillingAccount billingAccount);

}
