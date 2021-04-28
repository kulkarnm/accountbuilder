package com.bc.initialize.balances.account.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.balances.account.AccountBalancesInitializer;
import com.bc.initialize.balances.fees.AccountFeeBalancesInitializer;

public class RevolvingCreditBillingAccountBalancesInitializer implements AccountBalancesInitializer {
    @Override
    public BillingAccount initializeBalances(Product product, BillingAccount billingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount billingAccount) {
        return this.initializeBalances(product,billingAccount);
    }
}
