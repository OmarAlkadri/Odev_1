package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.company.Main.s;
import static java.sql.DriverManager.getConnection;

public class Personel extends veriTabanaBaglan implements IPersonel{
    private static final Scanner S = new Scanner(System.in);



    public void KulanciEkle(String adi, String email, String sifre) throws SQLException {
        Connection conn = baglan();
        PreparedStatement st = conn.prepareStatement("INSERT INTO kulanci_bilgi" +
                " (kulanci_adi,kulanci_email,kulanci_sifre) " +
                "VALUES (?,?,?)");


        ResultSet rs = conn.createStatement().executeQuery("SELECT kulanci_adi,kulanci_email  FROM kulanci_bilgi");
        while (rs.next()) {
            if (rs.getString("kulanci_adi").equals(adi)) {
                System.out.println("lutfan var olan kulanci ekleme!");
                System.out.println("kulanci adi giriniz:");
                adi = S.nextLine();
                adi = S.nextLine();
            }
            if (rs.getString("kulanci_email").equals(email)) {
                System.out.println("lutfan var olan email ekleme!");
                System.out.println("kulanci emaili adi giriniz:");
                email = S.nextLine();
                email = S.nextLine();
            }
        }
        st.setString(1, adi);
        st.setString(2, email);

        if (sifre.length()>5)
            st.setString(3, sifre);
        else {
            while (sifre.length()<5) {
                System.out.println("Sifre en az 5 karakter olmali");
                sifre = s.nextLine();
                sifre = s.nextLine();
            }
            st.setString(3, sifre);
        }
        st.executeUpdate();
        conn.close();
        st.close();
    }

    public boolean personel_giris(String personel_Adi, String personel_Sifre) throws SQLException {
        Connection conn = baglan();
        ResultSet rs = conn.createStatement().executeQuery("SELECT *  FROM personel_bilgi");
        while (rs.next()) {
            if (rs.getString("personel_adi").equals(personel_Adi)) {
                if (rs.getString("personel_sifre").equals(personel_Sifre)) {
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
        System.out.println("personel Adi ve Sifre yanlis.\n");
        rs.close();
        conn.close();
        return false;
    }
    public int PanaMenuyuGoster() {
        System.out.println("**********************************************");
        System.out.println("islemler : ");
        System.out.println("kulanci eklemek icin '1' basiniz :");
        System.out.println("sogutucu ac icin '2' basiniz");
        System.out.println("sogutucu kapat icin '3' basiniz");
        System.out.println("sicaklik goruntule icin '4' basiniz");
        System.out.println("cikis icin '5' basiniz");
        System.out.println("secim yapiniz:");
        System.out.println("**********************************************");
        return S.nextInt();
    }
}
