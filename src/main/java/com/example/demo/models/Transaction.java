package com.example.demo.models;

/**
 * Created by student on 6/20/17.
 */
public class Transaction {
    private int trans_id;
    private int acct_num;

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public int getAcct_num() {
        return acct_num;
    }

    public void setAcct_num(int acct_num) {
        this.acct_num = acct_num;
    }
}
