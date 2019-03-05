package com.example.valuesport;

import android.util.Log;

import java.util.ArrayList;

class WalletSingleton {
    private static final WalletSingleton ourInstance = new WalletSingleton();

    int credits;
    public ArrayList<Coupon> ownedCoupons;


    static WalletSingleton getInstance() {
        return ourInstance;
    }

    private WalletSingleton() {
        ownedCoupons = new ArrayList<>();
    }

    public static WalletSingleton getOurInstance() {
        return ourInstance;
    }

    public ArrayList<Coupon> getOwnedCoupons() {
        return ownedCoupons;
    }

    public void addCouponToWallet(Coupon coupon) {
        ownedCoupons.add(coupon);
        Log.d("debug", "Coupon added");
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


}