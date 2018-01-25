/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author WINDOWS 10
 */
public class LevelDriver {
    static void methodZ(int y,Level1 l){


    }
    
    static void methodZ(InterfaceX x){
        

    }
    public static void main(String[] args) {
        methodZ(new Level3());
        Level1 level11 = new Level3();
        
        level11.method1(0);
        
        System.out.println(level11.getClass());
        System.out.println(level11 instanceof Level1);
        System.out.println(level11 instanceof Level2);
        
        Dictionary<String, String> dictionary = new Hashtable();
        
        dictionary.put("indonesia", "Jogja");
        System.out.println(dictionary);
        
        InterfaceX ix = new Level3();
        
        List<String> list = new ArrayList<>();
        list.add("x");
        list.add("x");
        list.add("x");
        System.out.println(list);
        
//        Map<String, String> map= new HashMap<>();
//        map.put("key", "xxxx");
//        System.out.println(map.get("key"));
        
        Map<String, String> maps = new Hashtable();
        maps.put("Indonesia", "Jakarta");
        maps.put("Singapore", "Singapore");
        maps.put("Thailand", "Bangkok");
        
        //fitur java 8 lamda
        maps.forEach((k,v)->
            System.out.println(k + " ==> " + v));;
            
        List<String> lis = new ArrayList();
        lis.add("Nomor");
//        lis.add(29);
        lis.forEach(x -> System.out.println(x));
        
        
        
    }
}
