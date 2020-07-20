import java.util.Scanner;

public class duplicateCharacter {

    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(stringReverse(inputString));
    }

    public static String stringReverse(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        char[] inputCharArray=inputString.toCharArray();
        int[] charCount=new int[inputCharArray.length];
        boolean duplicatePresent=false;
        for(int i=0;i<=inputCharArray.length-1;i++)
        {
         char inputChar=inputCharArray[i];
            int numberOfCharacterRepeat=1;
         for(int j=i+1;j<=inputCharArray.length-1;j++)
         {
             if(inputCharArray[i]==inputCharArray[j])
             {
                 numberOfCharacterRepeat++;
                 inputCharArray[j]=' ';
             }

         }
            if(numberOfCharacterRepeat!=1)
            {
                outputString=outputString.append(inputCharArray[i]+"-"+numberOfCharacterRepeat+" ");

                duplicatePresent=true;
            }
        }
        if(duplicatePresent==false)
        {
            outputString.append("No Duplicates Present");
        }
        return outputString.toString();
    }
}
