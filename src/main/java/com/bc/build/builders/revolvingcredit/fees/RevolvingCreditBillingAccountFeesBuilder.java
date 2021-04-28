package com.bc.build.builders.revolvingcredit.fees;

import com.bc.build.builders.BillingAccountFeeBuilder;
import com.bc.build.builders.BillingAccountFeesBuilder;
import com.bc.build.entities.Product;

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
