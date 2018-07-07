package Guara;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

public class TableDemo {
   @Test
    public void TableTest(){
        Table<String, Integer, String> aTable = HashBasedTable.create();
        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }
        System.out.println(aTable.column(2)); //{A=A2, B=B2, C=C2}
        System.out.println(aTable.row("B")); //{1=B1, 2=B2, 3=B3}
        System.out.println(aTable.get("B", 2)); //B2
        System.out.println(aTable.contains("D", 1)); //false
        System.out.println(aTable.containsColumn(3)); //true
        System.out.println(aTable.containsRow("C")); //true
        System.out.println(aTable.columnMap()); //{1={A=A1, B=B1, C=C1}, 2={A=A2, B=B2, C=C2}, 3={A=A3, B=B3, C=C3}}
        System.out.println(aTable.rowMap()); //{A={1=A1, 2=A2, 3=A3}, B={1=B1, 2=B2, 3=B3}, C={1=C1, 2=C2, 3=C3}}
        System.out.println(aTable.remove("B", 3)); //B3
    }


}
