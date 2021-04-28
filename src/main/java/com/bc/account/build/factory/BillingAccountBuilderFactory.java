package com.bc.account.build.factory;

import com.bc.account.build.BillingAccountBuilder;
import com.bc.account.build.BillingAccountFeesBuilder;
import com.bc.account.build.BillingAccountPlansBuilder;

public interface BillingAccountBuilderFactory {
    public BillingAccountBuilder buildAccountBuilder();
    public BillingAccountPlansBuilder buildAccountPlansBuilder();
    public BillingAccountFeesBuilder buildAccountFeesBuilder();
}
