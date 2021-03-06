package com.bc.initialize.balances.plans.revolvingcredit;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.balances.plans.AbstractBillingAccountPlanBalancesInitializer;
import com.bc.initialize.balances.plans.BillingAccountPlanBalancesInitializer;

public class RevolvingCreditRetailAccountPlanBalancesInitializer extends AbstractBillingAccountPlanBalancesInitializer {
    private BillingCycleInitializer nextInitializer;

    public RevolvingCreditRetailAccountPlanBalancesInitializer(BillingCycleInitializer nextInitializer){
        this.nextInitializer=nextInitializer;
    }
    @Override
    public BillingAccountPlanBalancesInitializer initializePriorCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return this;
    }

    @Override
    public BillingAccountPlanBalancesInitializer initializeCurrentCycleBalances(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        return this;
    }

    @Override
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount, BillingAccount newBillingAccount) {
        super.initialize(product,oldBillingAccount,newBillingAccount);
        System.out.println("IN RevolvingCreditRetailAccountPlanBalancesInitializer");
        if(null!=nextInitializer){
            return nextInitializer.initialize(product,oldBillingAccount,newBillingAccount);
        }
        return newBillingAccount;
    }
}
