package com.bc.initialize.params.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.plans.AbstractBillingAccountPlanParametersInitializer;
import com.bc.initialize.params.plans.BillingAccountPlanParametersInitializer;

public class RevolvingCreditCashPlanParametersInitializer extends AbstractBillingAccountPlanParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditCashPlanParametersInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public BillingAccountPlanParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount) {

        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeInterestRate(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeTransactionFee(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        super.initialize(product,billingAccount);
        if(null!=nextInitializer){
            return nextInitializer.initialize(product,billingAccount);
        }
        return billingAccount;
    }
}
