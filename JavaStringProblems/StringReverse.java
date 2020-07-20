import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args)
    {
        System.out.println("Enter your Name");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println("The reversed string is "+stringReverse(inputString));
    }

    public static String stringReverse(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        char[] inputCharArray=inputString.toCharArray();
        for(int i=inputCharArray.length-1;i>=0;i--)
        {
            outputString=outputString.append(inputCharArray[i]);
        }
        return outputString.toString();
    }
}
