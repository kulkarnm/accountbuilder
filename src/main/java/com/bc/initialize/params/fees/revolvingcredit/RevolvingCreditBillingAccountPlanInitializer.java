package com.bc.initialize.params.fees.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.plans.AbstractBillingAccountPlanParametersInitializer;
import com.bc.initialize.params.plans.BillingAccountPlanParametersInitializer;

public class RevolvingCreditBillingAccountPlanInitializer extends AbstractBillingAccountPlanParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditBillingAccountPlanInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public BillingAccountPlanParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeCustomerPreferencesAndUnits(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountPlanParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount) {
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
