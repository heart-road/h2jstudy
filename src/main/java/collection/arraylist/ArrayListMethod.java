package collection.arraylist;

import hero.Hero;

import java.util.ArrayList;

/**
 * Created by runda on 2016/12/21.
 */
public class ArrayListMethod {
    public static void main(String[] args){
        method1();
    }

    private static void method1() {
        ArrayList<Hero> list = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            list.add(new Hero("hero "+i));
        }
        System.out.println(list.contains(new Hero("hero 1")));//different object
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
