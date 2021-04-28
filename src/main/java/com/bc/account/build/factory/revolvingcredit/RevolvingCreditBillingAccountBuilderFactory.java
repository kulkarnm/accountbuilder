package com.bc.account.build.factory.revolvingcredit;

import com.bc.account.build.BillingAccountBuilder;
import com.bc.account.build.BillingAccountFeesBuilder;
import com.bc.account.build.BillingAccountPlansBuilder;
import com.bc.account.build.factory.BillingAccountBuilderFactory;
import com.bc.account.build.revolvingcredit.account.RevolvingCreditBillingAccountBuilder;
import com.bc.account.build.revolvingcredit.fees.RevolvingCreditBillingAccountFeesBuilder;
import com.bc.account.build.revolvingcredit.plans.RevolvingCreditBillingAccountPlansBuilder;

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
