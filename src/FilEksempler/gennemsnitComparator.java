package FilEksempler;

import java.util.Comparator;

public class gennemsnitComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.gennemsnitskar == o2.gennemsnitskar) {
            return  0;
        } else if (o1.gennemsnitskar < o2.gennemsnitskar) {
            return  1;
        } else {
            return -1;
        }
    }
}
