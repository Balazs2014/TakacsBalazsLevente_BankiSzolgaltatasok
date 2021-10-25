package com.company.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla sz;

        if (hitelKeret <= 0) {
            sz = new MegtakaritasiSzamla(tulajdonos, 0, 0);
            szamlaLista.add(sz);
        } else {
            sz = new HitelSzamla(tulajdonos, 0, hitelKeret);
            szamlaLista.add(sz);
        }

        return sz;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int ossz = 0;

        for (Szamla item : szamlaLista) {
            if (item.getTulajdonos().equals(tulajdonos)) {
                ossz += item.getAktualisEgyenleg();
            }
        }

        return ossz;
    }

    /*public Szamla legnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {

    }*/

    public long osszHitelkeret() {
        long ossz = 0;

        for (Szamla item : szamlaLista) {

        }

        return ossz;
    }
}
