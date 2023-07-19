package BasicJava.List;

import java.util.LinkedList;

public class TestLinkListClass {
    public static void main(String[] args) {

        LinkedList<String > list=new LinkedList<>();
         list.add("lucky");
        list.add("lovely");
        list.add("Kashyap");
        System.out.println("its Adding Element "+list);
        //Changing Elements
        list.set(2,"prince");
        System.out.println("changing elements "+list);
       //Removing Elements
        list.remove(0);
        System.out.println("Removing Elements "+list);
        // Iterating the LinkedList
        for (String str: list
             ) {
            System.out.println(" Iterating the LinkedList  ->"+str);

        }
        //Linked list to To Array by using  toArray();
        Object[] arr = list.toArray();
        for (Object arr1:arr
             ) {
            System.out.println("Linked list to To Array by using  toArray(); "+arr1);

        }
        System.out.println("size of the list "+list.size());
        list.add("1");
        list.add("2");
        list.removeFirst();
        System.out.println("removefirst "+list);
        list.removeLast();
        System.out.println("removelast "+list);
    }
}
