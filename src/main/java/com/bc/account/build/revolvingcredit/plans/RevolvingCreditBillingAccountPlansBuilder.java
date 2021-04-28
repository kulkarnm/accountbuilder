package com.bc.account.build.revolvingcredit.plans;

import com.bc.account.build.BillingAccountPlanBuilder;
import com.bc.account.build.BillingAccountPlansBuilder;
import com.bc.account.build.entities.BillingAccountPlan;
import com.bc.account.build.entities.Product;
import com.bc.account.build.revolvingcredit.plans.CashPlanBuilder;
import com.bc.account.build.revolvingcredit.plans.RetailPlanBuilder;

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
