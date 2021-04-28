package com.bc.test;

import com.bc.account.build.*;
import com.bc.account.build.entities.BillingAccount;
import com.bc.account.build.entities.Product;
import com.bc.account.build.factory.BillingAccountBuilderFactory;
import com.bc.account.build.factory.revolvingcredit.RevolvingCreditBillingAccountBuilderFactory;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        BillingAccountBuilderFactory factory = new RevolvingCreditBillingAccountBuilderFactory();
        BillingAccountBuilder accountBuilder = factory.buildAccountBuilder();
        BillingAccountPlansBuilder plansBuilder = factory.buildAccountPlansBuilder();
        BillingAccountFeesBuilder feesBuilder = factory.buildAccountFeesBuilder();
        Product product = new Product();
        BillingAccount billingAccount = accountBuilder.buildBillingAccount();
        List<BillingAccountPlanBuilder> planBuilders = plansBuilder.buildBillingAccountPlanBuilders(product);
        for (BillingAccountPlanBuilder planBuilder : planBuilders) {
            billingAccount.addTtoPlan(planBuilder.
                    addParameters(product).
                    addBuckets(product).buildBillingAccountPlan());
        }
        List<BillingAccountFeeBuilder> feeBuilders = feesBuilder.buildBillingAccountFeeBuilders(product);
        for(BillingAccountFeeBuilder feeBuilder: feeBuilders){
            billingAccount.addToAccountFees(feeBuilder.
                    addParameters(product).
                    addBuckets(product).buildBillingAccountFee());
        }

        System.out.println(billingAccount);

    }
}
