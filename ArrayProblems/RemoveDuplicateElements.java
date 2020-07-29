import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateElements {

    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(removeDuplicateElementPrint(inputString));
    }

    public static String removeDuplicateElementPrint(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        ArrayList<Integer> ouputList=new ArrayList<>();
        String[] splitStringArray=inputString.split(",");
        HashMap<String,Integer> stringHashMap=new HashMap();
        for(int i=0;i<splitStringArray.length;i++) {
            if (!(stringHashMap.containsKey(splitStringArray[i]))) {
                ouputList.add((Integer.parseInt(splitStringArray[i].replaceAll("\\s", ""))));
                stringHashMap.put(splitStringArray[i],1);
            }
            else{
                stringHashMap.put(splitStringArray[i],stringHashMap.get(splitStringArray[i])+1);
            }
        }
        Collections.sort(ouputList);
        for(int j=0;j<ouputList.size();j++)
        {
            outputString.append(ouputList.get(j)+",");
        }
        return outputString.toString();
    }
}
