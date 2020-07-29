import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SumOfUniqueElements {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(sumOfUniqueElementsResult(inputString));
    }

    public static Integer sumOfUniqueElementsResult(String inputString)
    {
        int outputSumResult=0;
        ArrayList<Integer> ouputList=new ArrayList<>();
        inputString=inputString.substring(1,inputString.length()-1);
        String[] splitStringArray=inputString.split(", ");
        HashMap<String,Integer> stringHashMap=new HashMap();
        for(int i=0;i<splitStringArray.length;i++) {
            if (!(stringHashMap.containsKey(splitStringArray[i]))) {
                ouputList.add((Integer.parseInt(splitStringArray[i])));
                stringHashMap.put(splitStringArray[i],1);
            }
            else{
                stringHashMap.put(splitStringArray[i],stringHashMap.get(splitStringArray[i])+1);
            }
        }
        Collections.sort(ouputList);
        for(int j=0;j<ouputList.size();j++)
        {
            outputSumResult=outputSumResult+ouputList.get(j);
        }
        return outputSumResult;
    }
}
