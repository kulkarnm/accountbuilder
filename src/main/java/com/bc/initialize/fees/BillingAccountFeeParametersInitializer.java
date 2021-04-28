package com.bc.initialize.fees;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface BillingAccountFeeParametersInitializer extends BillingCycleInitializer {
    public BillingAccountFeeParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount);
    public BillingAccountFeeParametersInitializer initializeCustomerPreferencesAndUnits(Product product, BillingAccount billingAccount);
    public BillingAccountFeeParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount);

}
