package com.bc;

import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;
import com.bc.initialize.BillingCycleInitializer;
import com.bc.initialize.balances.account.revolvingcredit.RevolvingCreditBillingAccountBalancesInitializer;
import com.bc.initialize.balances.plans.revolvingcredit.RevolvingCreditCashAccountPlanBalancesInitializer;
import com.bc.initialize.balances.plans.revolvingcredit.RevolvingCreditPunitiveAccountPlanBalancesInitializer;
import com.bc.initialize.balances.plans.revolvingcredit.RevolvingCreditRetailAccountPlanBalancesInitializer;
import com.bc.initialize.params.account.revolvingcredit.RevolvingCreditBillingAccountParameterstInitializer;
import com.bc.initialize.params.plans.revolvingcredit.RevolvingCreditCashPlanParametersInitializer;
import com.bc.initialize.params.plans.revolvingcredit.RevolvingCreditPunitivePlanParametersInitializer;
import com.bc.initialize.params.plans.revolvingcredit.RevolvingCreditRetailPlanParametersInitializer;

public class CompleteBillingCycleInitializer {
    private BillingCycleInitializer firstParametersInitializer;

    public CompleteBillingCycleInitializer(){
        firstParametersInitializer =new RevolvingCreditBillingAccountParameterstInitializer(
                new RevolvingCreditCashPlanParametersInitializer(
                        new RevolvingCreditRetailPlanParametersInitializer(
                                new RevolvingCreditPunitivePlanParametersInitializer(
                                        new RevolvingCreditRetailAccountPlanBalancesInitializer(
                                                new RevolvingCreditCashAccountPlanBalancesInitializer(
                                                        new RevolvingCreditPunitiveAccountPlanBalancesInitializer(
                                                                new RevolvingCreditBillingAccountBalancesInitializer(null))))))));

    }
    public BillingAccount initialize(Product product, BillingAccount oldBillingAccount,BillingAccount newBillingAccount){
      return  firstParametersInitializer.initialize(product, oldBillingAccount,newBillingAccount);
    }

}
