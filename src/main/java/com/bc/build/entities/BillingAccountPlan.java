package com.bc.build.entities;

public class BillingAccountPlan implements Cloneable{
    @Override
    public BillingAccountPlan clone()
    {
        return new BillingAccountPlan();
    }
}
