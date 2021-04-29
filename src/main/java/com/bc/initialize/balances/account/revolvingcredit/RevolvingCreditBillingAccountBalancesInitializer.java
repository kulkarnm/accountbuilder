package com.bc.initialize.balances.account.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.balances.account.AccountBalancesInitializer;

public class RevolvingCreditBillingAccountBalancesInitializer implements AccountBalancesInitializer {
    @Override
    public BillingAccount initializeBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return this.initializeBalances(product,oldBillingAccount,newBillingAccount);
    }
}
