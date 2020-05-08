package com.company;

import java.util.concurrent.CompletableFuture;

public class Eyleyici implements IEyleyici
{
    private ObserverChannel o = ObserverChannel.getObserverChannel();
    private static Eyleyici e = null;//Singleton

    public static Eyleyici setEyleyici(){
        if (e == null)
            e = new Eyleyici();
        return e;
    }

    private Eyleyici(){}

    public void sogutucuAc(){
        if(!o.getDurum())
        {
            System.out.println("Sogutucu sistemi acildi");
            o.setDurum(!o.getDurum());
            SicaklikAlgilayici.setAlgilayici().getsicaklik();
        }else
        System.out.println("Sogutucu sistemi Acik");
    }

    public void sogutucukapat() {
        if(o.getDurum())
        {
            System.out.println("Sogutucu sistemi kapatildi");
            o.setDurum(!o.getDurum());
        }else
        System.out.println("Sogutucu sistemi kapali");
    }
}