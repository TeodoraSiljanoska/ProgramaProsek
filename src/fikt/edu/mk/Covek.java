package fikt.edu.mk;

public class Covek {
    String ime;     //ne e private, bidejki ako e private, togas ovoj atribut nema da moze da se nasleduva
    String prezime; //ne e private, bidejki ako e private, togas ovoj atribut nema da moze da se nasleduva

    //konstruktor
    public Covek(String Ime, String Prezime)
    {
        ime = Ime;
        prezime = Prezime;
    }

    //geteri i seteri
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }


    //toString() metodot
    public String toString() {
        return "Covek so " + "ime: " + ime + " ; prezime: " + prezime + " ne e student " + '\'' + ".";
    }
}