package com.company.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, double kamat) {
        super(tulajdonos, aktualisEgyenleg);
        this.kamat = kamat;
    }

    public double getAlapKamat() {
        return alapKamat;
    }

    public void setAlapKamat(double alapKamat) {
        this.alapKamat = alapKamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        boolean logikai = false;

        if (0 < (getAktualisEgyenleg() - osszeg)) {
            logikai = true;
        }

        return logikai;
    }

    public void kamatJovairas() {

    }
}
