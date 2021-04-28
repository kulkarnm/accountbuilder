package com.bc.build.entities;

import java.util.ArrayList;
import java.util.List;

public class BillingAccount {
    private List<BillingAccountPlan> plans;
    private List<BillingAccountFee> accountFees;
    public BillingAccount(){
        System.out.println("In am BillingAccount");
        plans = new ArrayList<>();
        accountFees = new ArrayList<>();
    }
    public void addTtoPlan(BillingAccountPlan plan){
        plans.add(plan);
    }
    public void addToAccountFees(BillingAccountFee fee){
        accountFees.add(fee);
    }

    @Override
    public String toString() {
        return "BillingAccount{" +
                "plans=" + plans +
                ", accountFees=" + accountFees +
                '}';
    }
}
