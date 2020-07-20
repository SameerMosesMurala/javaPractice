import java.util.Scanner;

public class FullStringReverse {

    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println("The reversed string is "+stringReverse(inputString));
    }

    public static String stringReverse(String inputString)
    {
        String[] outputStringArray=inputString.split(" ");
        StringBuffer outputStringBuffer=new StringBuffer("");
        for(int i=0;i<=outputStringArray.length-1;i++)
        {
            StringBuffer singleStringBuffer=new StringBuffer(outputStringArray[i]);
            outputStringBuffer=outputStringBuffer.append(singleStringBuffer.reverse()+" ");
        }
        return outputStringBuffer.toString();
    }
}
