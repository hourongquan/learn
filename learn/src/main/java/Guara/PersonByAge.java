package Guara;

import com.google.common.primitives.Ints;
import java.util.Comparator;

public class PersonByAge implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Ints.compare(person1.getAge(), person2.getAge());
    }
}