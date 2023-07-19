package BasicJava.StringPrograms;
//Java Program to Check Whether the String Consists of Special Characters
public class StringConsistsOfSpecialCharacters {
    public static void main(String[] args) {
        //Using Character class
        int Count=0;
        String str ="!#$GeeeksforGeeks.Computer.Science.Portal!!";

        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))&& !Character.isWhitespace(str.charAt(i))){
                Count++;
            }

        }
        if(Count==0){
            System.out.println("No Special Characters found. ");
        }else {
            System.out.println( "String has Special Characters\n" + Count + " "
                    + "Special Characters found.");
        }
    }
}

