package BasicJava.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static BasicJava.collections.Employee.getEmployeeList;

public class EmployeeData{
    public static void main(String[] args) {
        List<Employee> getEmList=getEmployeeList();
        for (Employee employeedataList :getEmList){
            System.out.println(employeedataList);
        }
        System.out.println("--------------------------");
        Collections.sort(getEmList);
        for (Employee employee11 :getEmList){
            System.out.println(employee11);
        }
       /*     @Override
            public int compare(Employee e, Employee ee) {
                if (e.name.equals(ee.name)){
                    return (int) (e.salary - ee.salary);}
                else return e.name.compareTo(ee.name);
            }*/
              Comparator<Employee> comparator =new Comparator<Employee>() {
                  @Override
                  public int compare(Employee o1, Employee o2) {
                     if (o1.salary==o2.salary)return 0;
                     return o1.salary>o2.salary?1:-1;
                  }
              } ;
        System.out.println("-------------sort--salary--------------------------------------------by comparator");
              Collections.sort(getEmList,comparator);
        for (Employee employee11 :getEmList){
            System.out.println(employee11);
        }

        Comparator<Employee> comparator1 =
          (o1,  o2)-> {

              return o1.dob.compareTo(o2.dob);
         
        } ;
        System.out.println("--------------------sort- dob--------------------------------------by comparator");
        Collections.sort(getEmList,comparator1);
        for (Employee employee11 :getEmList){
            System.out.println(employee11);
        }

        }


    }



