package com.bc.build.builders;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public interface BillingAccountBuilder {
    public BillingAccountBuilder addParameters(Product product);
    public BillingAccountBuilder addBuckets(Product product);
    public BillingAccount buildBillingAccount();
}
