package fikt.edu.mk;
import fikt.edu.mk.Student;
import fikt.edu.mk.Ocenka;


public class Main {
    public static void main(String[] args)
    {
        //objekti od klasata Student
        Student teodora = new Student("Teodora", "Siljanoska", "INKI659", "FIKT");
        teodora.SetOcenka(new Ocenka("Matematika1","11-11-2019",10));
        teodora.SetOcenka(new Ocenka("Strukturirano programiranje","19-11-2019",10));
        teodora.SetOcenka(new Ocenka("Digitalna logika i sistemi","12-11-2019",10));
        teodora.SetOcenka(new Ocenka("Ekonomija i biznis","17-11-2019",10));
        teodora.SetOcenka(new Ocenka("Aplikativen softver","25-11-2019",10));
        System.out.println(teodora.GetProsek());
        System.out.println(teodora.toString());

        Student drug = new Student("Andrea", "Andreevska", "INKI600", "FIKT");
        drug.SetOcenka(new Ocenka("Matematika1","11-11-2019",6));
        drug.SetOcenka(new Ocenka("Strukturirano programiranje","19-11-2019",8));
        drug.SetOcenka(new Ocenka("Digitalna logika i sistemi","12-11-2019",10));
        drug.SetOcenka(new Ocenka("Ekonomija i biznis","17-11-2019",7));
        drug.SetOcenka(new Ocenka("Aplikativen softver","25-11-2019",9));
        System.out.println(drug.GetProsek());
        System.out.println(drug.toString());

        //objekt od klasata Covek (samo za ilustracija)

        Covek nekoj = new Covek("Ivan", "Ivanovski");
        System.out.println(nekoj.toString());

    }
}
