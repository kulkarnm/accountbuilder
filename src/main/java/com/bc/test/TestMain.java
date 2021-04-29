package com.bc.test;

import com.bc.CompleteBillingCycleInitializer;
import com.bc.build.builders.*;
import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.build.factory.BillingAccountBuilderFactory;
import com.bc.build.factory.revolvingcredit.RevolvingCreditBillingAccountBuilderFactory;

import java.util.List;

public class TestMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        BillingAccountBuilderFactory factory = new RevolvingCreditBillingAccountBuilderFactory();

        BillingAccountBuilder accountBuilder = factory.buildAccountBuilder();
        BillingAccountPlansBuilder plansBuilder = factory.buildAccountPlansBuilder();
        BillingAccountFeesBuilder feesBuilder = factory.buildAccountFeesBuilder();

        Product product = new Product();
        BillingAccount oldBillingAccount = accountBuilder.buildBillingAccount();

        List<BillingAccountPlanBuilder> planBuilders = plansBuilder.buildBillingAccountPlanBuilders(product);
        for (BillingAccountPlanBuilder planBuilder : planBuilders) {
            oldBillingAccount.addTtoPlan(planBuilder.
                    addParameters(product).
                    addBuckets(product).buildBillingAccountPlan());
        }

        BillingAccount newAccount = (BillingAccount) oldBillingAccount.clone();
        CompleteBillingCycleInitializer initializer = new CompleteBillingCycleInitializer();
        newAccount = initializer.initialize(product,oldBillingAccount,newAccount );
        System.out.println(newAccount);

    }
}
