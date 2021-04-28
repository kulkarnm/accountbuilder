package com.bc.account.build.revolvingcredit.account;

import com.bc.account.build.BillingAccountBuilder;
import com.bc.account.build.entities.BillingAccount;
import com.bc.account.build.entities.Product;

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
