package utils;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        //random access - getting item by index O(1)
        //all other operations run in O(N) time

        List<String> list = new java.util.ArrayList();

        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");
        list.add("Aaryn");

        list.remove(0);

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.toArray()); //gives hashcode

        for (String s : list) {
            System.out.println(s);
        }

        Object[] array = list.toArray();

        for (Object s : array) {
            System.out.println(s);
        }

    }
}
