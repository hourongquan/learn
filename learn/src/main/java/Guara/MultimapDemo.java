package Guara;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import org.junit.Test;

public class MultimapDemo {
    @Test
    public void testMultimap(){
        Multimap<String,String> myMultimap=ArrayListMultimap.create();

        myMultimap.put("Fruits","Bannana");
        myMultimap.put("Fruits","Apple");
        myMultimap.put("Fruits","Pear");
        myMultimap.put("Vegetables","Carrot");

        int size= myMultimap.size();
        System.out.println(size);//4

        Collection<String> fruits=myMultimap.get("Fruits");
        System.out.println(fruits);//[Bannana,Apple,Pear]

        myMultimap.remove("Fruits","Pear");
        System.out.println(myMultimap.get("Fruits"));//[Bannana,Apple]

        myMultimap.removeAll("Fruits");
        System.out.println(myMultimap.get("Fruits"));//[](EmptyCollection!)
    }


}
