package com.bc.build.builders;

import com.bc.build.entities.BillingAccountPlan;
import com.bc.build.entities.Product;

public interface BillingAccountPlanBuilder {
    public BillingAccountPlanBuilder addParameters(Product product);
    public BillingAccountPlanBuilder addBuckets(Product product);
    public BillingAccountPlan buildBillingAccountPlan();
}
