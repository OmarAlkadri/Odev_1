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
        int sure;
        if (k.kulanci_giris(adi, sifre)) {
            int secim;
            do {
                secim = KanaMenuyuGoster();

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
                            KanaMenuyuGoster();
                    }
             }while (secim!=5);
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
                secim = PanaMenuyuGoster() - 1;

                switch (secim) {
                    case KULANCIEKLE:
                        System.out.println("kulanci adi giriniz:");
                        adi = S.nextLine();
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
                        PanaMenuyuGoster();
                }
            }while (secim!=5);
        }else {
            System.out.println("lutfan girdiniz bilgileri kontrol ediniz oyle giris yapiniz.\n\n\n");
            personelGiris();
        }
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
    private int PanaMenuyuGoster() {
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
