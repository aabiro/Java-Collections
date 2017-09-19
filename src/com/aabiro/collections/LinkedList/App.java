package com.aabiro.collections.LinkedList;

public class App {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();

        list.insert(10);
        list.insert(-2);
        list.insert(-3);
        list.insert(100);


        System.out.println(list.size());

        list.traverseList();

        list.remove(10);

        System.out.println();
        System.out.println(list.size());
        list.traverseList();

        List<Person> personList = new LinkedList<Person>();

        Person p = new Person(27, "Aaryn");

        personList.insert(p);
        personList.insert(new Person(33, "RJ"));
        personList.insert(new Person(217, "Nasty"));
        personList.insert(new Person(23, "Anthony"));
        personList.insert(new Person(274, "Leigh"));


        System.out.println();
        System.out.println(personList.size());

        personList.traverseList();

        //remove Person object instead of primative integer for example
        personList.remove(p);


        System.out.println();
        System.out.println(personList.size());

        personList.traverseList();


    }
}
