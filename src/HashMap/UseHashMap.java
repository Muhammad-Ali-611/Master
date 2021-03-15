package HashMap;

import java.util.*;

public class UseHashMap {

    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        list1.add("data1");
        list1.add("data2");
        list1.add("data3");
        list1.add("data4");

        //list String 2
        List<String> list2 = new ArrayList<>();
        list2.add("data1");
        list2.add("data2");
        list2.add("data3");
        list2.add("data4");

        //List String 3
        List<String> list3 = new ArrayList<>();
        list3.add("data1");
        list3.add("data2");
        list3.add("data3");
        list3.add("data4");

        //Using for each loop for iteration over map .entrySet().
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            //gte key value
            String KeyValue = entry.getKey();
            System.out.println("Key Value :" + KeyValue);

            //get list from map
            List<String> list = entry.getValue();

            Iterator<String> iterator = list1.iterator();
            System.out.print("list data :");

            //Using while loop with iterator to display list data
            while (iterator.hasNext());
            System.out.print(iterator.hasNext()+"");
        }
        System.out.println();
    }
}



