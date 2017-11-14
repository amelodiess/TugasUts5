/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author Amelia
 */
public class JajarGenjang implements BangunDatar {
    
    int luas, keliling;
    final int sisiAb, sisiBc, sisiCd, sisiDa, alas, tinggi;
    
    public JajarGenjang(int sisiAb, int sisiBc, int sisiCd, int sisiDa, int alas, int tinggi){
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCd = sisiCd;
        this.sisiDa = sisiDa;
        this.alas = alas;
        this.tinggi= tinggi;
        
    }
    

    @Override
    public void hitungLuas() {
        luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang : "+  luas);
    }    
    
    

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : "+ keliling);
        
    }
    
}
