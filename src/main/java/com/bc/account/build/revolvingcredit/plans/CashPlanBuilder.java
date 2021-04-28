package com.bc.account.build.revolvingcredit.plans;

import com.bc.account.build.BillingAccountPlanBuilder;
import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;

public class CashPlanBuilder implements BillingAccountPlanBuilder {
    private BillingAccountPlan cashPlan;
    public CashPlanBuilder(){
        cashPlan= new BillingAccountPlan();
    }
    @Override
    public BillingAccountPlanBuilder addParameters(Product product) {
        //add cash plan specific parameters to cash plan instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountPlanBuilder addBuckets(Product product) {
        //add cash plan specific bukckets to cash plan instance
        //return builder object
        //in current case do nothing
        return this;
    }

    @Override
    public BillingAccountPlan buildBillingAccountPlan() {
        return this.cashPlan;
    }
}
