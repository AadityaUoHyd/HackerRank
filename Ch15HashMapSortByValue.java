//Write a program in Java to Sort a HashMap by Value. Say given HashMap is : {A=5, B=7, C=3, D=1, E=2, F=8, G=4}

import java.util.*;
public class Ch15HashMapSortByValue{

     public static void main(String []args){
        
        Map<String,Integer> map = new HashMap<>();
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        
        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);
        
        System.out.println("HashMap before sorting by value : " + map);
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return (num1).compareTo(num2);
            }
        });
        
        for(int num: list){
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if (entry.getValue().equals(num)) {
                    lhm.put(entry.getKey(), num);
                }
            }
        }
        
        System.out.println("HashMap after sorting by value : " + lhm);
     }
}
