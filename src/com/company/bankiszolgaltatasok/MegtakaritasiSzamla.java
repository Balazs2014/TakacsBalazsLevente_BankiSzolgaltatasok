package com.company.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private static double alapKamat;
    private String kartyaSzam;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, String kartyaSzam) {
        super(tulajdonos, aktualisEgyenleg);
        this.kartyaSzam = kartyaSzam;
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
