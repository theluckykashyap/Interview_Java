package BasicJava;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

//public class ComparatorAndComparable implements Comparable<ComparatorAndComparable> {
public class ComparatorAndComparable  {
    int marks;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public ComparatorAndComparable(int marks, String name) {
        super();
        this.marks = marks;
        this.name = name;
    }


    @Override
    public String toString() {
        return "ComparatorAndComparable{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        List<ComparatorAndComparable> list = new ArrayList<>();
        list.add(new ComparatorAndComparable(515, "priya"));
        list.add(new ComparatorAndComparable(15, "lucky"));
        list.add(new ComparatorAndComparable(45, "neha"));
        list.add(new ComparatorAndComparable(515, "Anjali"));
        list.add(new ComparatorAndComparable(584, "suman"));
        list.add(new ComparatorAndComparable(58, "rahul"));
        list.add(new ComparatorAndComparable(78, "ram"));


        class TestComComparator implements Comparator<ComparatorAndComparable>{


            @Override
            public int compare(ComparatorAndComparable N, ComparatorAndComparable M) {
                if (N.name.equals(M.name)){
                    return N.marks - M.marks;
                }else return N.name.compareTo(M.name);
            }
        }
        //Collections.sort(list);
        Collections.sort(list,new TestComComparator());
        // ComparatorAndComparable.forEach(System.out::println);
        list.forEach(System.out::println);


    }

   /* @Override
    public int compareTo(ComparatorAndComparable o) {
        if (this.marks > o.marks) return 1;
        else if (this.marks < o.marks) return -1;
        return this.name.compareTo(o.name);
   }
*/


}

