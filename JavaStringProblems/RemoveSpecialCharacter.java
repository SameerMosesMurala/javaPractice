import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(removeSpecialChar(inputString));
    }

    public static String removeSpecialChar(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        StringBuffer inputStringBuffer=new StringBuffer(inputString);
        //char[] inputCharArray=inputString.toCharArray();
        //int[] charCount=new int[inputCharArray.length];
        //boolean duplicatePresent=false;
        for(int i=0;i<=inputStringBuffer.length()-1;i++)
        {
             char inputChar=inputStringBuffer.charAt(i);
             //int inputCharIntegerValue=Character.getNumericValue(inputChar);
            int inputCharIntegerValue=(int) inputChar;
            if((inputCharIntegerValue>=65 && inputCharIntegerValue<=90) || (inputCharIntegerValue>=97 && inputCharIntegerValue<=122))
             {

             }
            else
            {
                inputStringBuffer.deleteCharAt(i);
                i--;
            }
        }
        return inputStringBuffer.toString();
    }
}
