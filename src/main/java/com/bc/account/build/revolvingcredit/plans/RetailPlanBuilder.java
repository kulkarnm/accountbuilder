package com.bc.account.build.revolvingcredit.plans;

import com.bc.account.build.BillingAccountPlanBuilder;
import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;

public class RetailPlanBuilder implements BillingAccountPlanBuilder {
    private BillingAccountPlan retailPlan;
    public RetailPlanBuilder(){
        retailPlan = new BillingAccountPlan();
    }
    @Override
    public BillingAccountPlanBuilder addParameters(Product product) {
        //add retail plan specific parameters to cash plan instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountPlanBuilder addBuckets(Product product) {
        //add retail plan specific bukckets to cash plan instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountPlan buildBillingAccountPlan() {
        return this.retailPlan;
    }
}
