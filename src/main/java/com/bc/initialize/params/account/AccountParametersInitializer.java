package com.bc.initialize.params.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface AccountParametersInitializer extends BillingCycleInitializer {

    public AccountParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount);
    public AccountParametersInitializer initializeCustomerPreferencesAndLimits(Product product, BillingAccount billingAccount);
    public AccountParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount);

}
