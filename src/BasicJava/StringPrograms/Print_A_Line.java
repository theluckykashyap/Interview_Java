package BasicJava.StringPrograms;

public class Print_A_Line {
    public static void main(String[] args) {
        /*Using System.lineSeparator() method
        Using platform-dependent newline character
        Using System.getProperty() method
        Using %n newline character
        Using System.out.println() method*/


        String str = System.lineSeparator();
        System.out.println("lucky"+str+"kashyap");
        // Using new line Character '\n' to print
        // new line in between strings
        System.out.println("GFG" + '\n' + "gfg");
        String newline = System.getProperty("line.separator");

        // Printing new line between two strings
        System.out.println("GFG" + newline + "gfg");

        // Printing new line using new line
        // Character "%n" with the printf() method
        System.out.printf("GFG%ngfg");

        // System.out.println() function
        // over custom string inputs
        System.out.println("GFG");
        System.out.println("gfg");



    }
}
