package com.company;
import java.util.Random;


public class SicaklikAlgilayici
{
    Random r = new Random();
    private ObserverChannel o = ObserverChannel.getObserverChannel();
    private static SicaklikAlgilayici e = null;
    public static SicaklikAlgilayici setAlgilayici(){
        if (e == null)
            e = new SicaklikAlgilayici();
        return e;
    }
    private SicaklikAlgilayici(){
    }

    int sicaklik = 0;
    protected int getsicaklik(){
        if (o.getDurum())
            setsicaklik();
        return sicaklik;
    }

    private int setsicaklik() {
        return sicaklik = r.nextInt(100);
    }
}
