package com.bc.build.builders;

import com.bc.build.entities.BillingAccountFee;
import com.bc.build.entities.Product;

public interface BillingAccountFeeBuilder {
    public BillingAccountFeeBuilder addParameters(Product product);
    public BillingAccountFeeBuilder addBuckets(Product product);
    public BillingAccountFee buildBillingAccountFee();

}
