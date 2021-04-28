package com.bc;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.account.revolvingcredit.RevolvingCreditBillingAccountParameterstInitializer;
import com.bc.initialize.params.plans.revolvingcredit.RevolvingCreditBillingAccountPlanInitializer;

public class CompleteBillingCycleInitializer {
    private BillingCycleInitializer firstParametersInitializer;
    private BillingCycleInitializer firstBalancesInitializer;

    public CompleteBillingCycleInitializer(){
        firstParametersInitializer =new RevolvingCreditBillingAccountParameterstInitializer(
                new RevolvingCreditBillingAccountPlanInitializer(
                        new RevolvingCreditBillingAccountPlanInitializer(null)));

    }
    public BillingAccount initialize(Product product, BillingAccount billingAccount){

        billingAccount =  firstParametersInitializer.initialize(product,billingAccount);
        //firstBalancesInitializer = new RevolvingCre
        return billingAccount;
    }

}
