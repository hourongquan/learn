package Guara;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.util.Set;
import org.junit.Test;

public class PredicateDemo {
    @Test
    public void testPredicate() {
        Set<String> lowerCase = Sets.newHashSet("tom", "jhon");

        //using jdk
     /*   Set<String> notJhon = Sets.newHashSet();
        for (String s : lowerCase) {
            if(!"jhon".equalsIgnoreCase(s)){
                notJhon.add(s);
            }
        }*/

        //using guava
        Set<String> notJhon = Sets.filter(lowerCase, new Predicate<String>() {
            public boolean apply(String s) {
                return !"jhon".equalsIgnoreCase(s);
            }
        });

        System.out.println(notJhon);
    }


}
