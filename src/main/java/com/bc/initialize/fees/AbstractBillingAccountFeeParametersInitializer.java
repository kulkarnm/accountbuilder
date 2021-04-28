package com.bc.initialize.fees;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public abstract class AbstractBillingAccountFeeParametersInitializer implements BillingAccountFeeParametersInitializer {

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        this.initializeIdentityDefinition(product, billingAccount).
                initializeCustomerPreferencesAndUnits(product, billingAccount).
                initializeRuleParameters(product, billingAccount);
        return billingAccount;
    }
}
