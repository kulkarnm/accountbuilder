package com.bc.initialize.params.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.fees.AbstractBillingAccountFeeParametersInitializer;
import com.bc.initialize.params.fees.BillingAccountFeeParametersInitializer;

public class RevolvingCreditBillingAccountPlanInitializer extends AbstractBillingAccountFeeParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditBillingAccountPlanInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public BillingAccountFeeParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountFeeParametersInitializer initializeCustomerPreferencesAndUnits(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccountFeeParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount) {
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
