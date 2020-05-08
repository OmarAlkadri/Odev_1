package com.company;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class merkeziIslemBirimi {
    private static final int KULANCIEKLE = 0;
    private static final int AC = 1;
    private static final int KAPAT = 2;
    private static final int GORUNTULE =3;
    private static final int CIKIS = 4;
    private Eyleyici e = Eyleyici.setEyleyici();
    private SicaklikAlgilayici sA = SicaklikAlgilayici.setAlgilayici();
    private static final Scanner S = new Scanner(System.in);

    private void SogutucuAc(){e.sogutucuAc();}
    private void SogutucuKapat(){e.sogutucukapat();}
    private int SicaklikOku(){return sA.getsicaklik();}

    public void KulanciGiris() throws SQLException, InterruptedException {

        Kulanci k = new Kulanci();
        String adi, sifre;

        System.out.println("kulanci adi giriniz:");
        adi = S.nextLine();
        System.out.println("kulanci sifre giriniz:");
        sifre = S.nextLine();
        if (k.kulanci_giris(adi, sifre)) {
            int secim;
            do {
                secim = k.KanaMenuyuGoster();

                switch (secim) {
                        case AC:
                            SogutucuAc();
                            break;
                        case KAPAT:
                            SogutucuKapat();
                            break;
                        case GORUNTULE:
                            System.out.println(SicaklikOku());
                            break;
                        case CIKIS:
                            break;
                        default:
                            k.KanaMenuyuGoster();
                    }
             }while (secim!=4);
        }else {
            System.out.println("lutfan girdiniz bilgileri kontrol ediniz oyle giris yapiniz.\n\n\n");
            KulanciGiris();
        }
    }
    public void personelGiris() throws SQLException, InterruptedException {
        Personel p = new Personel();
        String adi,email, sifre;

        System.out.println("kulanci adi giriniz:");
        adi = S.nextLine();
        System.out.println("kulanci sifre giriniz:");
        sifre = S.nextLine();
        int sure;
        if (p.personel_giris(adi, sifre)) {
            int secim;
            do {
                secim = p.PanaMenuyuGoster() - 1;

                switch (secim) {
                    case KULANCIEKLE:
                        System.out.println("kulanci adi giriniz:");
                        adi = S.nextLine();
                        System.out.println("kulanci email giriniz:");
                        email = S.nextLine();
                        System.out.println("kulanci sifre giriniz:");
                        sifre = S.nextLine();
                        p.KulanciEkle(adi,email,sifre);
                        break;
                    case AC:
                        SogutucuAc();
                        break;
                    case KAPAT:
                        SogutucuKapat();
                        break;
                    case GORUNTULE:
                        System.out.println(SicaklikOku());
                        break;
                    case CIKIS:
                        break;
                    default:
                        p.PanaMenuyuGoster();
                }
            }while (secim!=4);
        }else {
            System.out.println("lutfan girdiniz bilgileri kontrol ediniz oyle giris yapiniz.\n\n\n");
            personelGiris();
        }
    }
}
