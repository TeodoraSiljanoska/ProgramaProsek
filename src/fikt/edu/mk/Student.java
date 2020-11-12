package fikt.edu.mk;
import java.util.*;
import java.util.ArrayList;
import fikt.edu.mk.Covek;
import fikt.edu.mk.Ocenka;


public class Student extends Covek {

    private String brojNaIndeks;
    private String fakultet;
    private Ocenka nizaOcenki[];
    private double prosek;

    public Student(String ime, String prezime, String brIndeks, String Fakultet ) {
        super(ime, prezime);
        nizaOcenki = new Ocenka[0];
        brojNaIndeks = brIndeks;
        fakultet = Fakultet;

    }

    //geteri i seteri
    public String getBrojNaIndeks() {
        return brojNaIndeks;
    }

    public void setBrojNaIndeks(String brojNaIndeks) {
        this.brojNaIndeks = brojNaIndeks;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    //ocenkata se stava vo nizata na ocenki na studentot
    public void SetOcenka(Ocenka o) {
        nizaOcenki = Arrays.copyOf(nizaOcenki, nizaOcenki.length + 1);
        nizaOcenki[nizaOcenki.length - 1] = o;

    }

    //presmetka na prosek
    public double GetProsek() {
        double zbir = 0;
        if (nizaOcenki.length > 0)          //ako ima vneseni ocenki (dolzinata na nizata od ocenki e pogolema od 0
        {
            for (Ocenka o : nizaOcenki)         //listanje na ocenki
            {
                zbir += o.getOcenka();      //sobiranje na vrednosta na ocenkite
            }
            this.prosek = zbir / nizaOcenki.length;     //presmetka na prosek (zbir na ocenkite/brojot na ocenki)
            return this.prosek;
        }
        else            //ako nema vneseni ocenki (dolzinata na nizata od ocenki ne e pogolema od 0)
            {
            return 0.0f;        //prosekot e 0.0 (ne se presmetuva)
        }
    }


    //toString() metodot
    @Override
    public String toString() {
        return "Student so " + '\'' + "ime: " + ime + " ; prezime: " + prezime + " od fakultet: " + fakultet + " ; so broj na indeks: " + brojNaIndeks +  " ima oceni: " + Arrays.toString(nizaOcenki) + "; presmetan prosek: " + prosek + '\'' + '.';
    }
}

