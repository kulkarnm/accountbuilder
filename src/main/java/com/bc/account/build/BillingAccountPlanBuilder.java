package com.bc.account.build;

import com.bc.account.build.entities.BillingAccount;
import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;

public interface BillingAccountPlanBuilder {
    public BillingAccountPlanBuilder addParameters(Product product);
    public BillingAccountPlanBuilder addBuckets(Product product);
    public BillingAccountPlan buildBillingAccountPlan();
}
