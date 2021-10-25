package com.company.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, int hitelKeret) {
        super(tulajdonos, aktualisEgyenleg);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        boolean logikai = false;

        if (this.hitelKeret < (getAktualisEgyenleg() - osszeg)) {
            logikai = true;
        }

        return logikai;
    }
}
