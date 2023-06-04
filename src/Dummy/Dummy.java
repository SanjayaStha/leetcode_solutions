package Dummy;

import java.util.*;

public class Dummy {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        List<HashMap> list = new ArrayList<>();

        map.put("name", "Sanjaya2");
        map.put("date", "2022-01-01 12:12:12");
        list.add(map);

        map = new HashMap<>();
        map.put("name", "sanjaya1");
        map.put("date", "2022-01-01 12:12:12");
        list.add(map);

        System.out.println(list.toString());
        Collections.sort(list, new Comparator<HashMap>() {
            @Override
            public int compare(HashMap o1, HashMap o2) {
                String first = (String) o1.get("date");
                String second = (String) o2.get("date");

                int comp = first.compareTo(second);
                if(comp==0){
                    String first1 = (String) o1.get("name");
                    String second1 = (String) o2.get("name");

                    comp = first1.compareTo(second1);
                }
                return comp;
            }
        });
        System.out.println(list.toString());

    }

}
