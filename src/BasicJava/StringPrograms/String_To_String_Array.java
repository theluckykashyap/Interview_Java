package BasicJava.StringPrograms;
//Java Program to Convert String to String Array
//Java Program to Convert String to Integer Array
public class String_To_String_Array {
    public static void main(String[] args) {
        String str = "lucky kashyap";
        // Using str.split() method
        String arr[]= str.split(" ");

        System.out.println("String : " + str);
        System.out.println("String array : [ ");

        // Iterating over the string
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" , ");

        }
        System.out.print("]");
    }

}
