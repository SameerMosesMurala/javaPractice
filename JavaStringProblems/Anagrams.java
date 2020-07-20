import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args)
    {
        System.out.println("Enter your First String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println("Enter your Second String");
        String inputString2=scan.nextLine();
        if(anagramChecker(inputString,inputString2))
        {
            System.out.println("Given strings are Anagrams");
        }
        else{
            System.out.println("Given strings are not Anagrams");
        }

    }

    public static Boolean anagramChecker(String inputString,String inputString2)
    {
        int[] count1=new int[256];
        int[] count2=new int[256];
        for (int i = 0; i < inputString.length(); i++)
            count1[inputString.charAt(i)]++;
        for (int i = 0; i < inputString2.length(); i++)
            count2[inputString2.charAt(i)]++;
        boolean anagramCheck=true;
        for(int j=0;j<256;j++)
        {
            if(count1[j]!=count2[j])
            {
                anagramCheck=false;
            }
        }
        return anagramCheck;
    }
}
