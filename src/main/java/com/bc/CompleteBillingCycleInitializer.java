package com.bc;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.account.revolvingcredit.RevolvingCreditBillingAccountInitializer;
import com.bc.initialize.fees.BillingAccountFeeParametersInitializer;
import com.bc.initialize.fees.revolvingcredit.RevolvingCreditBillingAccountPlanInitializer;
import com.bc.initialize.plans.revolvingcredit.RevolvingCreditBillingAccountFeeInitializer;

public class CompleteBillingCycleInitializer {
    private BillingCycleInitializer nextInitializer;


    public BillingAccount initialize(Product product, BillingAccount billingAccount){
        nextInitializer=new RevolvingCreditBillingAccountInitializer(new RevolvingCreditBillingAccountPlanInitializer(new RevolvingCreditBillingAccountFeeInitializer(null)));
        return nextInitializer.initialize(product,billingAccount);
    }

}
