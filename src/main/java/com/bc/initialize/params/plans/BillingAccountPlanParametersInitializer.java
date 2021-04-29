package com.bc.initialize.params.plans;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;

public interface BillingAccountPlanParametersInitializer extends BillingCycleInitializer {
    public BillingAccountPlanParametersInitializer initializeIdentityDefinition(Product product, BillingAccount billingAccount);
    public BillingAccountPlanParametersInitializer initializeInterestRate(Product product, BillingAccount billingAccount);
    public BillingAccountPlanParametersInitializer initializeRuleParameters(Product product, BillingAccount billingAccount);
    public BillingAccountPlanParametersInitializer initializeTransactionFee(Product product, BillingAccount billingAccount);

}
