import java.util.Scanner;
import java.util.Stack;

public class MatchingPairParenthesis {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        if(parenthesisChecker(inputString)){
            System.out.println("Matching");
        }
        else
        {
            System.out.println("Not Matching");
        }

    }

    public static Boolean parenthesisChecker(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        Stack<Character> charStack = new Stack<Character>();
        Boolean parathesisState=true;
        for(int i=0;i<=inputString.length()-1;i++)
        {
         if(inputString.charAt(i)=='(' || inputString.charAt(i)=='{' || inputString.charAt(i)=='[')
         {
             charStack.push(inputString.charAt(i));
         }
         if(inputString.charAt(i)==')' || inputString.charAt(i)=='}' || inputString.charAt(i)==']')
         {
             char poppedChar=charStack.pop();
             char inverseChar=' ';
             if(poppedChar=='(')
             {
                 inverseChar=')';
             }
             else if(poppedChar=='{')
             {
                 inverseChar='}';
             }
             else
             {
                 inverseChar=']';
             }
             if(inputString.charAt(i)==inverseChar)
             {
             }
             else
             {
                 parathesisState=false;
             }
         }
        }
        return parathesisState;
    }
}
