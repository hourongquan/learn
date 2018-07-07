package Guara;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

public class BiMapDemo {
    @Test
    public void test(){
        BiMap<String,String> britishToAmerican =  HashBiMap.create();

        //Initialise and use just like a normal map
        britishToAmerican.put("aubergine","eggplant");
        britishToAmerican.put("courgette","zucchini");
        britishToAmerican.put("jam","jelly");

        System.out.println(britishToAmerican.get("aubergine")); // eggplant
        BiMap<String,String> americanToBritish =britishToAmerican.inverse();

        System.out.println(americanToBritish.get("eggplant")); // aubergine
        System.out.println(americanToBritish.get("zucchini")); // courgette

    }

}
