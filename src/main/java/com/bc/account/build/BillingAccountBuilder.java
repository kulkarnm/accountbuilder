package com.bc.account.build;

import com.bc.account.build.entities.BillingAccount;
import com.bc.account.build.entities.Product;

public interface BillingAccountBuilder {
    public BillingAccountBuilder addParameters(Product product);
    public BillingAccountBuilder addBuckets(Product product);
    public BillingAccount buildBillingAccount();
}
