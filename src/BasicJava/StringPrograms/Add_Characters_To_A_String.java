package BasicJava.StringPrograms;

//Java Program to Add Characters to a String
public class Add_Characters_To_A_String {
   // Method 3: Using substring() method

    public static String AddCharToA_String(String str, char ch,int pos){
        return str.substring(0,pos)+ch+str.substring(pos);
    }
    public static void main(String[] args) {
        String str="luck";
        char ch='y';
       // Method 1: Using + operator
        String str1=str+ch;
        System.out.println(str1);
        System.out.println(AddCharToA_String(str,ch,0));


    }
}
