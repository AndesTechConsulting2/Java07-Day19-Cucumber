package org.andestech.learning.rfb18.g2.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;

import java.util.List;
import java.util.Map;

public class SuitWebTest {

    @Дано("домены")
    public void домены(List<String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(dataTable);
    }

    @Если("адреса валидные")
    public void адресаВалидные() {
        // Write code here that turns the phrase above into concrete actions
         //throw new cucumber.api.PendingException();
    }


    @Дано("имя, фамилия, логин")
    public void имяФамилияЛогин(List<Map<String,String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
       for(Map<String,String> map: dataTable)
       {
           for(String key: map.keySet())
           {
               System.out.println( key + " -> " + map.get(key));

           }

       }


    }


}
