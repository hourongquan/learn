package Guara;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import org.junit.Test;

public class MultisetDemo {

    @Test
    public void testMultiset(){
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(
            Lists.newArrayList("good","good","study","day","day","up"));

        assertEquals(wordsMultiset.count("good"),2);

        wordsMultiset.remove("good",2);
        assertEquals(wordsMultiset.count("good"),0);
    }


}
