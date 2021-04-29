package com.bc.build.entities;

import java.util.ArrayList;
import java.util.List;

public class BillingAccount implements Cloneable{
    private List<BillingAccountPlan> plans;
    public BillingAccount(){
        System.out.println("In am BillingAccount");
        plans = new ArrayList<>();
    }
    public void addTtoPlan(BillingAccountPlan plan){
        plans.add(plan);
    }

    @Override
    public String toString() {
        return "BillingAccount{" +
                "plans=" + plans +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BillingAccount cloneAccount=  (BillingAccount)super.clone();
        List<BillingAccountPlan> clonedPlans = new ArrayList<>();
        for(BillingAccountPlan plan : plans){
            clonedPlans.add(plan.clone());
        }
        cloneAccount.plans=clonedPlans;
        return cloneAccount;
    }
}
