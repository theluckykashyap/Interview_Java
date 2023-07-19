package BasicJava.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    Integer idEm;
    String name;
    double salary;
    boolean gender;
    Date dob;

    public Employee() {
        System.out.println("Employee class");
    }

    public Employee(int id, String name, double salary, boolean gender, Date dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.dob = dob;
    }

    public Employee(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    static boolean getGender(String gender){
        if(gender!=null && !gender.equals("")){
            if (gender.equalsIgnoreCase("female"))
                return false;
        }
        return true;
    }
 static String getStringValue(String str) {
     String sr = null;
     if (!str.equals("")) {
         //sr= str.toUpperCase();
         sr= str.substring(0,1).toUpperCase()+str.substring(1);
         System.out.println(str+" String is toUpperCase "+sr);
     }
     return sr;
 }
    static Date getDate(String str)  {
        if(!str.equals("")){
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
            Date date1= null;
            try {
                date1 = simpleDateFormat.parse(str);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return date1;
        }
        return null;
    }

    static List<Employee> getEmployeeList(){
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee(10,getStringValue("lucky"),120000,getGender(""),getDate("25-07-2000")));
        employees.add(new Employee(33,getStringValue("prince"),150000,getGender(""),getDate("24-08-2001")));
        employees.add(new Employee(10,"Lovely ",180000,getGender("female"),getDate("26-09-2000")));
        employees.add(new Employee(10,"Priya ",10000,getGender(""),getDate("21-02-2002")));
        employees.add(new Employee(10,"Ram ",190000,getGender(""),getDate("20-08-2005")));
        employees.add(new Employee(10,"Rahul",110000,getGender(""),getDate("20-05-2004")));
        employees.add(new Employee(10,"Neha",1130000,getGender("female"),getDate("25-07-2000")));
        employees.add(new Employee(10,"Jaya ",1560000,getGender("female"),getDate("19-01-2000")));
       return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
     /*  if (this.salary >o.salary)return -1;
       else if (this.salary >o.salary)return 1;
       return this.name.compareTo(o.name);

*/  return this.name.compareTo(o.name);
    }


            /*if (N.name.equals(M.name)){
                return N.marks - M.marks;
            }else return N.name.compareTo(M.name);*/
        }



