package BasicJava.NumberQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=12021;
        String str = String.valueOf((num));
        int temp=num;
        int palindrome=0;
        while(num>0){
            int num1=num%10;
            palindrome=(palindrome*10)+num1;
            num=num/10;

        }
        if (temp==palindrome) System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");

        StringBuffer stringBuffer = new StringBuffer(str);
            String str1= String.valueOf(stringBuffer.reverse());
        if (str.equals(str1)) System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");

                 boolean flag = true;
        for (int i=0,k=str.length()-1;i<str.length()/2 && k<= str.length()-1/2; i++,k--){
            flag = str.charAt(i) == str.charAt(k);
        }
        if(flag)System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");
        int i=0;
        boolean flag1=true;
        for (int k=str.length()-1;k<str.length();k++){
           flag1= str.charAt(i)==str.charAt(k);

        }
        i++;
        if(flag1)System.out.println("number is palindrome");
        else System.out.println("number is not palindrome");






    }
}
