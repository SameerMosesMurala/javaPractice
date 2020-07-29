import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ZeroAndOneSegregator {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(zeroAndOneSegregate(inputString));
    }

    public static String zeroAndOneSegregate(String inputString)
    {
        StringBuffer outStringBuffer=new StringBuffer();
        ArrayList<Integer> ouputList=new ArrayList<>();
        inputString=inputString.substring(1,inputString.length()-1);
        String[] splitStringArray=inputString.split(", ");
        HashMap<String,Integer> stringHashMap=new HashMap();
        for(int i=0;i<splitStringArray.length;i++) {
            if (!(stringHashMap.containsKey(splitStringArray[i]))) {
                stringHashMap.put(splitStringArray[i],1);
            }
            else{
                stringHashMap.put(splitStringArray[i],stringHashMap.get(splitStringArray[i])+1);
            }
        }
        outStringBuffer.append("[");
        String key="0";
        int keyRepeat=stringHashMap.get(key);
            for(int i=0;i<keyRepeat;i++)
            {
              outStringBuffer.append("0, ");
            }
            key="1";
        keyRepeat=stringHashMap.get(key);
        for(int i=0;i<keyRepeat;i++)
        {
            outStringBuffer.append("1, ");
        }
        outStringBuffer.deleteCharAt(outStringBuffer.length()-1);
        outStringBuffer.deleteCharAt(outStringBuffer.length()-1);
        outStringBuffer.append("]");
        return outStringBuffer.toString();
    }
}
