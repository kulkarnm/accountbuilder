package com.bc.build.factory;

import com.bc.build.builders.BillingAccountBuilder;
import com.bc.build.builders.BillingAccountFeesBuilder;
import com.bc.build.builders.BillingAccountPlansBuilder;

public interface BillingAccountBuilderFactory {
    public BillingAccountBuilder buildAccountBuilder();
    public BillingAccountPlansBuilder buildAccountPlansBuilder();
    public BillingAccountFeesBuilder buildAccountFeesBuilder();
}
