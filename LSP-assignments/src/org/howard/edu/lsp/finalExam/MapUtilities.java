package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

//@throws NullMapException
public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException{
        int total = 0;
        if (map1 == null || map2 == null) {
            throw new NullMapException("One or both maps are null!");
        }
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(map2.containsKey(key)){
                if(map2.get(key).equals(value)){
                    total++;
                }
            }
        }
        return total;
    }
}