package com.bc.initialize.params.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface BillingAccountParametersInitializer extends BillingCycleInitializer {

    public BillingAccountParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount);
    public BillingAccountParametersInitializer initializeCustomerPreferencesAndLimits(Product product, BillingAccount billingAccount);
    public BillingAccountParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount);

}
