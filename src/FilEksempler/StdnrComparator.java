package FilEksempler;

import java.util.Comparator;

public class StdnrComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        if (o1.stdnr == o2.stdnr) {
            return  0;
        } else if (o1.stdnr > o2.stdnr) {
            return  1;
        } else {
            return -1;
        }
    }
}
