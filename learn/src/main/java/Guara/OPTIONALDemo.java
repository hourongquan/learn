package Guara;

import static org.junit.Assert.assertEquals;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.util.Map;
import org.junit.Test;

public class OPTIONALDemo {
    @Test
    public void test(){
        Map<Integer,Integer> map=Maps.newHashMap();
        map.put(1,null);
        assertEquals(map.get(1),null);
        assertEquals(map.get(2),null);

        Optional presentOpt= Optional.of("object");
        Optional presentOpt2= Optional.of(null);
        assertEquals(presentOpt.get(),"object");
        Optional absentOpt = Optional.absent();
        absentOpt.get();//抛出IllegalStateException
        assertEquals(presentOpt.isPresent(),true);
        assertEquals(absentOpt.isPresent(),false);


        String a=null;
        Optional  possible=  Optional.fromNullable(a);
        assertEquals(absentOpt.isPresent(),false);
        assertEquals(possible.or("123"),"123");
        a="a";
        Optional possible2=Optional.fromNullable(a);
        assertEquals(possible2.isPresent(),true);



    }

}
