package com.company;
import java.sql.*;
import java.util.Scanner;

import static java.sql.DriverManager.*;

public class Kulanci extends veriTabanaBaglan implements Ikulanci{

    private static final Scanner S = new Scanner(System.in);

    public boolean kulanci_giris(String kulanci_Adi, String kulanci_Sifre) throws SQLException {
        Connection conn = baglan();
        ResultSet rs = conn.createStatement().executeQuery("SELECT kulanci_adi,kulanci_sifre  FROM kulanci_bilgi");
        while (rs.next()) {
            if (rs.getString("kulanci_adi").equals(kulanci_Adi)) {
                if (rs.getString("kulanci_sifre").equals(kulanci_Sifre)) {
                    rs.close();
                    conn.close();
                    return true;
                } else {
                    System.out.println("Sifre Yanlis.\n");
                    rs.close();
                    conn.close();
                    return false;
                }
            }
        }
        System.out.println("Kulanci Adi ve Sifre yanlis.\n");
        rs.close();
        conn.close();
        return false;
    }
    private int KanaMenuyuGoster() {
        System.out.println("**********************************************");
        System.out.println("islemler : ");
        System.out.println("sogutucu ac icin '1' basiniz");
        System.out.println("sogutucu kapat icin '2' basiniz");
        System.out.println("sicaklik goruntule icin '3' basiniz");
        System.out.println("cikis icin '4' basiniz");
        System.out.println("secim yapiniz:");
        System.out.println("**********************************************");
        return S.nextInt();
    }
}
