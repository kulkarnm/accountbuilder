package com.bc.initialize.params.account.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.params.account.AbstractBillingAccountParametersInitializer;
import com.bc.initialize.params.account.AccountParametersInitializer;

public class RevolvingCreditBillingAccountParameterstInitializer extends AbstractBillingAccountParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditBillingAccountParameterstInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public AccountParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public AccountParametersInitializer initializeCustomerPreferencesAndLimits(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public AccountParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount) {
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