package com.bc.build.factory.revolvingcredit;

import com.bc.build.builders.BillingAccountBuilder;
import com.bc.build.builders.BillingAccountFeesBuilder;
import com.bc.build.builders.BillingAccountPlansBuilder;
import com.bc.build.factory.BillingAccountBuilderFactory;
import com.bc.build.builders.revolvingcredit.account.RevolvingCreditBillingAccountBuilder;
import com.bc.build.builders.revolvingcredit.fees.RevolvingCreditBillingAccountFeesBuilder;
import com.bc.build.builders.revolvingcredit.plans.RevolvingCreditBillingAccountPlansBuilder;

public class RevolvingCreditBillingAccountBuilderFactory implements BillingAccountBuilderFactory {
    @Override
    public BillingAccountBuilder buildAccountBuilder() {
        return new RevolvingCreditBillingAccountBuilder();
    }

    @Override
    public BillingAccountPlansBuilder buildAccountPlansBuilder() {
        return new RevolvingCreditBillingAccountPlansBuilder();
    }

    @Override
    public BillingAccountFeesBuilder buildAccountFeesBuilder() {
        return new RevolvingCreditBillingAccountFeesBuilder();
    }
}
