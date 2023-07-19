package BasicJava.StringPrograms;

//Java Program to Convert String to Float Value
public class Convert_String_To_Float_Value {
    public static void main(String[] args) {
        //Method 1: Using parseFloat()
        String str="98";
        float f=Float.parseFloat(str);
        System.out.println("its using method parseFloat "+f);

        //Method 2: Using valueof() method
        float f1=Float.valueOf(str);
        System.out.println("its using method valueof()  "+f1);

    }
}
