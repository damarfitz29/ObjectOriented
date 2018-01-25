
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Percabangan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//        while (true) {
            System.out.print("Bulan : ");
            BULAN bln = BULAN.valueOf(scanner.nextLine());
//            int bulan = scanner.nextInt();
            int jml_hari = 0;
            System.out.print("Tahun : ");
            int tahun = scanner.nextInt();
        
            switch (bln) {
                case JANUARI:
                case MARET:
                case MEI:
                case JULI:
                case AGUSTUS:
                case OKTOBER:
                case DESEMBER:
                    jml_hari = 31;
                    break;
                case APRIL:
                case JUNI:
                case SEPTEMBER:
                case NOVEMBER:
                    jml_hari = 30;
                    break;
                case FEBRUARI:
                    jml_hari = tahun%4==0? 29:28;
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            System.out.println("Jumlah Hari : " + jml_hari);
        }
    }
//}

enum BULAN {

    JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER;
}
