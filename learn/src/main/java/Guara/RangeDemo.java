package Guara;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class RangeDemo {
    @Test
    public void test(){
        System.out.println("open:"+Range.open(1, 10));
        System.out.println("closed:"+ Range.closed(1, 10));
        System.out.println("closedOpen:"+ Range.closedOpen(1, 10));
        System.out.println("openClosed:"+ Range.openClosed(1, 10));
        System.out.println("greaterThan:"+ Range.greaterThan(10));
        System.out.println("atLeast:"+ Range.atLeast(10));
        System.out.println("lessThan:"+ Range.lessThan(10));
        System.out.println("atMost:"+ Range.atMost(10));
        System.out.println("all:"+ Range.all());
        System.out.println("closed:"+Range.closed(10, 10));
      //  System.out.println("closedOpen:"+Range.closedOpen(10, 10));


        Range<Integer> ageRange = Range.closed(35,50);
        Function<Person,Integer> ageFunction = new Function<Person,
            Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        };
        Predicate<Person> predicate = Predicates.compose(ageRange,ageFunction);
        List<Person> list= Lists.newArrayList();
        list.add(new Person("Lei","li",15,"男"));
        list.add(new Person("Bin","Wang",40,"男"));
        list.add(new Person("Mei","Han",37,"男"));

        List filterlist = Lists.newArrayList( Collections2.filter(list,predicate));
        System.out.println(filterlist);
    }

}


