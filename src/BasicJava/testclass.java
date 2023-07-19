package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class testclass {
    public static void main(String[] args) {
        /*
        * array have fixed size.
        * its a homogenious type of data
        * its index base
        *
        * */
        int [] arr = {1,2,3,4,56,6,0};

        for (int i=0;i< arr.length-1;i++){
            System.out.println(arr[i]);
        }
       // System.out.println( Arrays.sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();
         arrayList.add(25);
         arrayList.add(26);
         arrayList.add(45);
        System.out.println(arrayList);
        for (int num:arrayList
             ) {
            System.out.println(num);
        }
        Iterator i=arrayList.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toString());
        }
      //  Collections.sort(arrayList);

        ArrayList<Object> ar = new ArrayList<>();
        ar.add(1234);
        ar.add("255353");
        ar.add(898.98);
        ar.add(true);
        for(Object ob:ar){
            System.out.println(ob);
        }
    }
}
