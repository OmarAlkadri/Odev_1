package com.company;
import java.sql.SQLException;
import java.util.Scanner;

public interface Ikulanci {
    boolean kulanci_giris(String kulanci_Adi, String kulanci_Sifre) throws SQLException;
}
