package com.bc.build.builders;

import com.bc.build.entities.Product;

import java.util.List;

public interface BillingAccountPlansBuilder {

    List<BillingAccountPlanBuilder> buildBillingAccountPlanBuilders(Product product);
}
