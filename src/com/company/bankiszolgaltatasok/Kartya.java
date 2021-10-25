package com.company.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas {
    private Szamla szamla;
    private String kartyaszam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaszam = kartyaszam;
    }

    public String getKartyaszam() {
        return kartyaszam;
    }

    public boolean Vasarlas(int osszeg) {
        boolean logikai = false;

        if(0 < szamla.getAktualisEgyenleg() - osszeg) {
            logikai = true;
        }

        return logikai;
    }
}
