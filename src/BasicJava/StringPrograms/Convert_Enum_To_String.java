package BasicJava.StringPrograms;


// Enum
enum Fruits {
    Orange,
    Apple,
    Banana,
    Mango;
}
public class Convert_Enum_To_String {
    public static void main(String[] args) {
 // we can solve this problem using two method .
        //method 1. using name()
        System.out.println(Fruits.Apple.name());
        //method 2. using toString
        System.out.println(Fruits.Banana.toString());
    }
}
