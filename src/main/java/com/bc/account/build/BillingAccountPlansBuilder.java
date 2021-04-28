package com.bc.account.build;

import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;

import java.util.List;

public interface BillingAccountPlansBuilder {

    List<BillingAccountPlanBuilder> buildBillingAccountPlanBuilders(Product product);
}
