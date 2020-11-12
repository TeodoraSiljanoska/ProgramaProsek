package fikt.edu.mk;

public class Ocenka {
     private  String predmet;
     private  String datum;
     private  int ocenka;

         //konstruktor
        public Ocenka(String Predmet, String Datum, int Ocenka) {
            ocenka = Ocenka;
            datum = Datum;
            predmet = Predmet;
        }

        //geteri i seteri

        public String getPredmet() {
                return predmet;
        }

        public void setPredmet(String predmet) {
                this.predmet = predmet;
        }

        public String getDatum() {
                return datum;
        }

        public void setDatum(String datum) {
                this.datum = datum;
        }

        public int getOcenka() {
                return ocenka;
        }

        public void setOcenka(int ocenka) {
                this.ocenka = ocenka;
        }


         //toString() metodot
        @Override
        public String toString() {
                return  "Predmet: '" + predmet + '\'' + ", Datum: '" + datum + '\'' + ", Ocenka: " + ocenka + '.';
        }
}
