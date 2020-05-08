package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ObserverChannel{
    private static boolean durum = false;

    private PropertyChangeSupport support;

    private static ObserverChannel o;

    public static ObserverChannel getObserverChannel(){
        if (o == null)
            o = new ObserverChannel();
        return o;
    }
    private ObserverChannel(){
        support = new PropertyChangeSupport(this);
    }

    public boolean getDurum(){
        return durum;
    }

    public void setDurum(boolean newValue){
        support.firePropertyChange("durum", this.durum, newValue);
        this.durum = newValue;
    }
}
