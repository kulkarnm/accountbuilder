package com.bc.initialize.balances.account.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.balances.account.AbstractBillingAccountBalancesInitializer;

public class RevolvingCreditBillingAccountBalancesInitializer extends AbstractBillingAccountBalancesInitializer {
    private BillingCycleInitializer nextInitializer;

    public RevolvingCreditBillingAccountBalancesInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer =nextInitializer;
    }
    @Override
    public BillingAccount initializeBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return null;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        super.initialize(product,oldBillingAccount,newBillingAccount);
        System.out.println("IN RevolvingCreditBillingAccountBalancesInitializer");
        if(null!=nextInitializer){
            return nextInitializer.initialize(product,oldBillingAccount,newBillingAccount);
        }
        return newBillingAccount;
    }

}
