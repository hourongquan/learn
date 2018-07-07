package Guara;

import static org.junit.Assert.assertEquals;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import java.util.Arrays;
import org.junit.Test;

public class StringHaddle {
   //Joiner：合并字符串
    // @Test
    public void testJoiner(){
        String str1 = Joiner.on(";").skipNulls()
            .join(Arrays.asList("a","b",null,"c"));
        assertEquals(str1,"a;b;c");

        String str2 = Joiner.on(",").join(Arrays.asList(1, 5, 7));
        assertEquals(str2,"1,5,7");
    }
   //Splitter
    @Test
    public void testSplitter(){
        Iterable<String> arrs = Splitter.on(',')
//            .trimResults()
            .omitEmptyStrings()
            .split(",a,,b,");


        String str2 = Joiner.on(";").join(arrs);
        assertEquals(str2,"a;b");


    }
    @Test
    public void testCharMatcher(){
        assertEquals(
            CharMatcher.DIGIT.retainFrom("some text 89983 and more"),"89983");
        assertEquals(
            CharMatcher.DIGIT.removeFrom("some text 89983 and more"),
            "some text  and more");
        assertEquals(
            CharMatcher.anyOf("abcxy").removeFrom("abcdefgxyz"),"defgz");

        //匹配条件复合运算
        String str1 = CharMatcher.inRange('a', 'f')
            .and(CharMatcher.isNot('c'))
            .and(CharMatcher.isNot('e'))
            .or(CharMatcher.is('z'))
            .replaceFrom("abyczef", "*");
        assertEquals(str1,"**yc*e*");
    }





}
