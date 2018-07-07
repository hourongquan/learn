package Guara;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.List;
import org.junit.Test;

public class OrderingDemo {
    @Test
    public void test(){
        List<Person> list= Lists.newArrayList();
        list.add(new Person("Lei","li",37,"男"));
        list.add(new Person("Bin","Wang",40,"男"));
        list.add(new Person("Mei","Han",37,"男"));
        Ordering ordering= Ordering.from(new PersonByAge()).reverse();
        List<Person> list1 = ordering.sortedCopy(list);
        System.out.println(list1);
        Ordering ordering1 =  Ordering.from(new PersonByAge()).compound(new PersonByFirstName());

        List<Person> list2 = ordering1.sortedCopy(list);
        System.out.println(list2);

    }

}
