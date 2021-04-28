package com.bc.account.build.revolvingcredit.fees;

import com.bc.account.build.BillingAccountFeeBuilder;
import com.bc.account.build.entities.BillingAccountFee;
import com.bc.account.build.entities.Product;

public class LateFeeBuilder implements BillingAccountFeeBuilder {

    private BillingAccountFee billingAccountFee;
    public LateFeeBuilder(){
        this.billingAccountFee = new BillingAccountFee();
    }
    @Override
    public BillingAccountFeeBuilder addParameters(Product product) {
        //add late plan specific parameters to fee instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountFeeBuilder addBuckets(Product product) {
        //add late plan specific buckets to fee instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountFee buildBillingAccountFee() {
        return this.billingAccountFee;
    }
}
