package BasicJava.List;

import java.util.Vector;

public class TestVectorClass {
    public static void main(String[] args) {
        try {
        Vector<Integer> vector =new Vector<Integer>();
        //adding element add()
          vector.add(45);
          vector.add(65);
        System.out.println("adding element"+vector);
        //updating element set()
        vector.set(5,100);
        System.out.println("updating element "+vector);
        //removing element remove()

    vector.remove(45);
    System.out.println("removing element " + vector);
}catch (Exception e){
        System.out.println(e.getMessage());
        }finally {
            System.out.println("its vector programming");
    }


    }
}
