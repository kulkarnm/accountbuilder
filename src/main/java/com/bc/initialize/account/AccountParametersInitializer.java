package com.bc.initialize.account;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public interface AccountParametersInitializer extends BillingCycleInitializer{

    public AccountParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount);
    public AccountParametersInitializer initializeCustomerPreferencesAndUnits(Product product, BillingAccount billingAccount);
    public AccountParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount);

}
