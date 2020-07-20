import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(nonRepeatCharacter(inputString));
    }

    public static String nonRepeatCharacter(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        char[] inputCharArray=inputString.toCharArray();
        int[] charCount=new int[inputCharArray.length];
        boolean duplicatePresent=false;
        for(int i=0;i<=inputCharArray.length-1;i++)
        {
            char inputChar=inputCharArray[i];
            int numberOfCharacterRepeat=0;
            for(int j=i+1;j<=inputCharArray.length-1;j++)
            {
                if(inputCharArray[i]==inputCharArray[j])
                {
                    numberOfCharacterRepeat++;
                    inputCharArray[j]=' ';
                }

            }
            if(numberOfCharacterRepeat==0 && inputCharArray[i]!=' ' && duplicatePresent!=true)
            {
                outputString=outputString.append(inputCharArray[i]);
                duplicatePresent=true;
            }
        }
        //if(duplicatePresent==false)
        //{
         //   outputString.append("No Duplicates Present");
        //}
        return outputString.toString();
    }
}
