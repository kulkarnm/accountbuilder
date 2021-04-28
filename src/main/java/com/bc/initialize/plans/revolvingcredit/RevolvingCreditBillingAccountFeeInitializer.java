package com.bc.initialize.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.fees.AbstractBillingAccountFeeParametersInitializer;
import com.bc.initialize.fees.BillingAccountFeeParametersInitializer;
import com.bc.initialize.plans.AbstractBillingAccountPlanParametersInitializer;
import com.bc.initialize.plans.BillingAccountPlanParametersInitializer;

public class RevolvingCreditBillingAccountFeeInitializer extends AbstractBillingAccountFeeParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditBillingAccountFeeInitializer(BillingCycleInitializer nextInitializer){
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
