package com.example.projektwkckfront;

import java.util.Date;

public class Wypozyczenia {
    private int id;
    private int dataWypozyczenia;
    private int termin;
    private int idKsiazka;
    private int idCzytelnik;

    public void setId(int id) {
        this.id = id;
    }

    public void setDataWypozyczenia(int dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public void setTermin(int termin) {
        this.termin = termin;
    }

    public void setIdKsiazka(int idKsiazka) {
        this.idKsiazka = idKsiazka;
    }

    public void setIdCzytelnik(int idCzytelnik) {
        this.idCzytelnik = idCzytelnik;
    }

    public int getId() {
        return id;
    }

    public int getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public int getTermin() {
        return termin;
    }

    public int getIdKsiazka() {
        return idKsiazka;
    }

    public int getIdCzytelnik() {
        return idCzytelnik;
    }

    public Wypozyczenia(int id, int dataWypozyczenia, int termin, int idKsiazka, int idCzytelnik) {
        this.id = id;
        this.dataWypozyczenia = dataWypozyczenia;
        this.termin = termin;
        this.idKsiazka = idKsiazka;
        this.idCzytelnik = idCzytelnik;
    }
}
