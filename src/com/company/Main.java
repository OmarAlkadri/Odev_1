package com.company;

import java.sql.*;
import java.util.Scanner;
public class Main
{
    static Scanner s = new Scanner(System.in);
    private static final int KULANCIGIRIS = 1;
    private static final int PERSONELGIRIS = 2;

    static void agArayuzu() throws SQLException, InterruptedException {
        merkeziIslemBirimi m =new merkeziIslemBirimi();
        System.out.println("**********************************************");
        System.out.println("kulanci giris icin '1'");
        System.out.println("persyonel giris icin '2'");
        System.out.println("uye girisi seciniz:");
        int secim = s.nextInt();
        switch (secim) {
            case KULANCIGIRIS:
                m.KulanciGiris();
                break;
            case PERSONELGIRIS:
                m.personelGiris();
                break;
            default:
                secim = s.nextInt();
        }
    }
        /*
    static void KulanciGiris() throws SQLException {
        Kulanci k = new Kulanci();

        System.out.println("kulanci adi giriniz:");
        adi = s.nextLine();
        adi = s.nextLine();
        System.out.println("kulanci sifre giriniz:");
        sifre = s.nextLine();
        if (k.kulanci_giris(adi, sifre)) {
            switch (KanaMenuyuGoster()) {
                case AC:
                    break;
                case KAPAT:
                    break;
                case BEKLETMEK:
                    break;
                case GORUNTULE:
                    break;
                case CIKIS:
                    break;
                default:
            }
        }else {
            System.out.println("lutfan girziniz bilgileri kontrol ediniz oyle giris yapiniz.\n\n\n");
            KulanciGiris();
        }
    }
    static void personalGiris(){
        Kulanci k = new Kulanci();
        System.out.println("kulanci adi giriniz:");
        System.out.println("kulanci sifre giriniz:");
        if (true) {
            switch (KanaMenuyuGoster()) {
                case AC:
                    break;
                case KAPAT:
                    break;
                case BEKLETMEK:
                    break;
                case GORUNTULE:
                    break;
                case CIKIS:
                    break;
                default:
            }
        }
    }

    private int PanaMenuyuGoster() {
        System.out.println("**********************************************");
        System.out.println("islemler : ");
        //System.out.println("kulanci eklemek icin 2 basiniz :");
        System.out.println("sogutucu ac icin '1' basiniz");
        System.out.println("sogutucu kapat icin '2' basiniz");
        System.out.println("sogutucu bekletmek icin '3' basiniz");
        System.out.println("sicaklik goruntule icin '4' basiniz");
        System.out.println("cikis icin '5' basiniz");
        System.out.println("secim yapiniz:");
        System.out.println("**********************************************");
        return s.nextInt();
    }

    public static void calis() throws SQLException {
        Scanner s = new Scanner(System.in);
        Kulanci k = new Kulanci();
        int secenek = 0;
        String adi, sifre;
        String emill;
        System.out.println("lutfan kulanci adi giriniz");
        adi = s.nextLine();
        System.out.println("lutfan kulanci emill giriniz");
        emill = s.nextLine();
        System.out.println("lutfan kulanci sifre giriniz");
        sifre = s.nextLine();
        k.KulanciEkle(adi,emill,sifre);
        System.out.println("lutfan kulanci sifre giriniz");
        secenek = s.nextInt();
        if (secenek == 0) {
            calis();
        }
    }

    public static void agArayuzu() throws InterruptedException, SQLException {



        Kulanci k = new Kulanci();
        Scanner s = new Scanner(System.in);
        merkeziIslemBirimi m = new merkeziIslemBirimi();

        String adi, sifre;
        String emill;
        int secenek = 0;
        do {
            System.out.println("kulanci girisi icin '2' basiniz");
            System.out.println("Kulanci Ekle icin '1' basiniz");
            secenek = s.nextInt();
            if (secenek == 1)
            {
                    adi = s.nextLine();
                    System.out.println("lutfan kulanci adi giriniz");
                    adi = s.nextLine();
                    System.out.println("lutfan kulanci emill giriniz");
                    emill = s.nextLine();
                    System.out.println("lutfan kulanci sifre giriniz");
                    sifre = s.nextLine();
                    k.KulanciEkle(adi,emill,sifre);
            }
            if (secenek == 2) {
                adi = s.nextLine();
                do {
                    System.out.println("lutfan kulanci adi giriniz");
                    adi = s.nextLine();
                    System.out.println("lutfan kulanci sifre giriniz");
                    sifre = s.nextLine();
                } while (!k.kulanci_giris(adi, sifre));
                System.out.println("\nGiris yapildi\n\n");
            }
        }while (secenek != 2);
        do {
            System.out.println("islemler : ");
            System.out.println("sogutucu ac icin '1' basiniz");
            System.out.println("sogutucu kapat icin '2' basiniz");
            System.out.println("sogutucu bekletmek icin '3' basiniz");
            System.out.println("sicaklik goruntule icin '4' basiniz");
            System.out.println("cikis icin '5' basiniz");
            System.out.println("iztediniz islem seciniz");
            secenek = s.nextInt();
            switch (secenek)
            {
                case 1:
                    m.SogutucuAc();
                    break;
                case 2:
                    m.SogutucuKapat();
                    break;
                case 3:
                    int sure;
                    System.out.println("bekletmek istediniz sure giriniz");
                    sure = s.nextInt();
                    m.SogutucuBeklet(sure);
                    break;
                case 4:
                    m.SicaklikOku();
                    break;
                default:
                    continue;
            }
        } while (secenek != 5);


    }
    */
    public static void main(String[] args) throws InterruptedException, SQLException {
    agArayuzu();
}
}