package com.bc.account.build.revolvingcredit.fees;

import com.bc.account.build.BillingAccountFeeBuilder;
import com.bc.account.build.BillingAccountFeesBuilder;
import com.bc.account.build.BillingAccountPlanBuilder;
import com.bc.account.build.entities.BillingAccountFee;
import com.bc.account.build.entities.Product;
import com.bc.account.build.revolvingcredit.plans.CashPlanBuilder;
import com.bc.account.build.revolvingcredit.plans.RetailPlanBuilder;

import java.util.ArrayList;
import java.util.List;

public class RevolvingCreditBillingAccountFeesBuilder implements BillingAccountFeesBuilder{

    @Override
    public List<BillingAccountFeeBuilder> buildBillingAccountFeeBuilders(Product product) {
        // based on product(classes associated with product) choose appropriate plan builders to be added
        //currently it is hardcoded to casha plan builder and retail plan builder
        List<BillingAccountFeeBuilder> feeBuilders = new ArrayList<>();
        feeBuilders.add(new LateFeeBuilder());
        return feeBuilders;
    }
}
