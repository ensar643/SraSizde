package com.example.srasizde;

import android.util.Log;

public class Personel extends Maas {
    private int yas;
    public void setYas(int yas) {
        if (yas < 18 || yas > 55) {
            Log.e("Kapsülleme", "Hatalı yaş");
            yas = 18;
        }
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    private int maas;
    public void setMaas(int maas) {
        if (maas < 4253) {
            Log.e("Kapsülleme", "Hatalı maaş");
            maas = 4253;
        }
        this.maas = maas;
    }
    public int getMaas() {
        return maas;
    }
}