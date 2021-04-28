package com.bc.initialize.account.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.account.AbstractBillingAccountParametersInitializer;
import com.bc.initialize.account.AccountParametersInitializer;

public class RevolvingCreditBillingAccountInitializer extends AbstractBillingAccountParametersInitializer {
    private BillingCycleInitializer nextInitializer;
    public RevolvingCreditBillingAccountInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public AccountParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public AccountParametersInitializer initializeCustomerPreferencesAndUnits(Product product, BillingAccount billingAccount) {
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
