package com.bc.build.builders.revolvingcredit.plans;

import com.bc.build.builders.BillingAccountPlanBuilder;
import com.bc.build.entities.BillingAccountPlan;
import com.bc.build.entities.Product;

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
