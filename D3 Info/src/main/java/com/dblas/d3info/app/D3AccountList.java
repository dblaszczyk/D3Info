package com.dblas.d3info.app;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by dblaszc on 6/19/2014.
 */
public class D3AccountList {
    private ArrayList<D3Account> mAccounts;
    private Context mAppContext;

    public D3AccountList(ArrayList<D3Account> mAccounts)    {
        mAppContext = mAppContext;
        mAccounts = new ArrayList<D3Account>();
    }

    public ArrayList<D3Account> getmAccounts() {
        return mAccounts;
    }

    public D3Account getAccount(String accountName) {
        for (D3Account a : mAccounts){
            if(a.getmAccountName().equals(accountName))
                return a;
        }
        return null;
    }
}
