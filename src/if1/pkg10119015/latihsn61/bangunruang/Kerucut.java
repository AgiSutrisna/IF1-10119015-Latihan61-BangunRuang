/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihsn61.bangunruang;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class Kerucut implements BangunRuang{
    private int r;
    private int tinggi;
    // tinggi = 9, r = 14
    
    public Kerucut(int r,int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return (22*r*r*tinggi)/(3*7);
    }

    @Override    
    public void tampilBangunRuang() {
        System.out.printf("Hasil : V = %.0f%n", hitungVolume());
    }
}
