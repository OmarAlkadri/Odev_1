package com.company;

import java.sql.SQLException;

public interface IPersonel {
    void KulanciEkle(String adi, String emill, String sifre) throws SQLException;
    boolean personel_giris(String personel_Adi, String personel_Sifre) throws SQLException;
}
