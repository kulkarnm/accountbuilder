package com.bc.initialize.params.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.plans.AbstractBillingAccountPlanParametersInitializer;
import com.bc.initialize.params.plans.BillingAccountPlanParametersInitializer;

public class RevolvingCreditPunitivePlanParametersInitializer extends AbstractBillingAccountPlanParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditPunitivePlanParametersInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public BillingAccountPlanParametersInitializer initializeIdentityDefinition(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeInterestRate(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeRuleParameters(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeTransactionFee(Product product, BillingAccount oldBillingAccount, BillingAccount newBIllingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        super.initialize(product, oldBillingAccount, newBillingAccount);
        System.out.println("IN RevolvingCreditPunitivePlanParametersInitializer");
        if(null!=nextInitializer){
            return nextInitializer.initialize(product, oldBillingAccount,newBillingAccount );
        }
        return oldBillingAccount;
    }
}
