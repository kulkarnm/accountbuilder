package com.bc.build.builders.revolvingcredit.plans;

import com.bc.build.builders.BillingAccountPlanBuilder;
import com.bc.build.builders.BillingAccountPlansBuilder;
import com.bc.build.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class RevolvingCreditBillingAccountPlansBuilder implements BillingAccountPlansBuilder {

    private List<BillingAccountPlanBuilder> accountPlanBuilders;
    @Override
    public List<BillingAccountPlanBuilder> buildBillingAccountPlanBuilders(Product product) {
        // based on product(classes associated with product) choose appropriate plan builders to be added
        //currently it is hardcoded to casha plan builder and retail plan builder
        List<BillingAccountPlanBuilder> planBuilders = new ArrayList<>();
        planBuilders.add(new CashPlanBuilder());
        planBuilders.add(new RetailPlanBuilder());
        return planBuilders;
    }
}
