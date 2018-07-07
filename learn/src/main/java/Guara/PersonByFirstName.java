package Guara;

import com.google.common.primitives.Ints;
import java.util.Comparator;

public class PersonByFirstName  implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFirstName().compareTo(person2.getFirstName());
    }
}
