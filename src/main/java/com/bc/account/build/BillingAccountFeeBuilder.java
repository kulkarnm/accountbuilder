package com.bc.account.build;

import com.bc.account.build.entities.BillingAccountFee;
import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;

public interface BillingAccountFeeBuilder {
    public BillingAccountFeeBuilder addParameters(Product product);
    public BillingAccountFeeBuilder addBuckets(Product product);
    public BillingAccountFee buildBillingAccountFee();

}
