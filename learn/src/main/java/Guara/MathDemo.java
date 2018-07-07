package Guara;

import com.google.common.math.IntMath;
import org.junit.Test;

public class MathDemo {

    @Test
    public void test(){
        int a=2000000000;
        int b=2000000000;
        System.out.println(a+b);
        System.out.println(IntMath.checkedAdd(2000000000,2000000000));


    }

}
