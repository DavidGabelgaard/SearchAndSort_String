package FilEksempler;

public class Person implements Comparable <Person> {

    public int stdnr;
    public String fnavn;
    public String enavn;
    public double gennemsnitskar;

    public Person(int stdnr, String fnavn, String enavn, double gennemsnitskar) {
        this.stdnr = stdnr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.gennemsnitskar = gennemsnitskar;
    }


    @Override
    public String toString() {
        return "Person{" +
                "stdnr=" + stdnr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", gennemsnitskar=" + gennemsnitskar +
                '}' + "\n";
    }

    @Override
    public int compareTo(Person o) {
        if (gennemsnitskar == o.gennemsnitskar) {
            return  0;
        } else if (gennemsnitskar < o.gennemsnitskar) {
            return  1;
        } else {
            return -1;
        }
    }


 /*
    @Override
    public int compareTo(Person o) {
        return enavn.compareToIgnoreCase(o.enavn);
    }

    @Override
    public int compareTo(Person o) {
        return fnavn.compareToIgnoreCase(o.fnavn);
    }

    @Override
    public int compareTo(Person student) {
        if (stdnr == student.stdnr) {
            return  0;
        } else if (stdnr > student.stdnr) {
            return  1;
        } else {
            return -1;
        }
    }

    */










}
