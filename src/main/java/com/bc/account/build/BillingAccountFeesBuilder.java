package com.bc.account.build;

import com.bc.account.build.entities.BillingAccountFee;
import com.bc.account.build.entities.Product;

import java.util.List;

public interface BillingAccountFeesBuilder {
    List<BillingAccountFeeBuilder> buildBillingAccountFeeBuilders(Product product);
}
