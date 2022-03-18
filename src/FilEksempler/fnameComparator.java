package FilEksempler;

import java.util.Comparator;

public class fnameComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return  o1.fnavn.compareToIgnoreCase(o2.fnavn);
    }
}
