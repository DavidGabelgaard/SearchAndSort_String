package FilEksempler;

import java.util.Comparator;

public class enameComparator  implements Comparator <Person> {



    public int compare(Person o1, Person o2) {
        return o1.enavn.compareToIgnoreCase(o2.enavn);
    }
}
