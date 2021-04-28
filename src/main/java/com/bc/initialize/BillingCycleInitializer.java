package com.bc.initialize;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public interface BillingCycleInitializer {
    public BillingAccount initialize(Product product, BillingAccount billingAccount);

}
