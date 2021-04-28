package com.bc.build.builders.revolvingcredit.account;

import com.bc.build.builders.BillingAccountBuilder;
import com.bc.build.entities.BillingAccount;
import com.bc.build.entities.Product;

public class RevolvingCreditBillingAccountBuilder  implements BillingAccountBuilder {

    private BillingAccount billingAccount;
    public RevolvingCreditBillingAccountBuilder(){
        billingAccount = new BillingAccount();
    }
   public BillingAccountBuilder addParameters(Product product){
        //revolving credit product based parameters building
       //in current case do nothing
       return this;
   }

   public BillingAccountBuilder addBuckets(Product Product){
       //product based Buckets building
       //in current case do nothing
       return this;
   }
   public BillingAccount buildBillingAccount(){
        return this.billingAccount;
   }
}
