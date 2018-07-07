package Guara;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Test;

public class FunctionDemo {
    @Test
    public void testTransform(){
        List<String> lowerCase = Lists.newArrayList("tom","jhon") ;

        List<String> upperCase = Lists.transform(lowerCase,
            new Function<String, String>() {
                public String apply(String s) {
                    return s.toUpperCase();
                }}
        );
        System.out.println(upperCase);
    }


}
