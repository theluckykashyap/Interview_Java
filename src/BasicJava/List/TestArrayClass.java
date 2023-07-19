package BasicJava.List;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        //adding element with add() methods
        arrayList.add("this");
        arrayList.add("is");
        arrayList.add("a");
        arrayList.add("table");
        arrayList.add(".....");
        System.out.println(arrayList);
        //removing element with remove() methods
        arrayList.remove(".....");
        System.out.println("its remove() arraylist "+arrayList);
        //Changing Elements
         arrayList.set(3,"ball");
        System.out.println("its set() arraylist "+arrayList);
        //Iterating the ArrayList
        for (String str:arrayList) {
            System.out.println("iterating the ArrayList "+str);

        }
        //  Get Elements
        String n = arrayList.get(1);
        System.out.println("get elements "+n);
        //Add Elements between Two Numbers
        arrayList.add(3,"Name");
        System.out.println("add Element between two number "+arrayList);
    //Arraylist Sort
        Collections.sort(arrayList);
        System.out.println("sorted ArrayList "+ arrayList);

        //Size of Elements
        System.out.println("size of elements "+arrayList.size());


    }
}
