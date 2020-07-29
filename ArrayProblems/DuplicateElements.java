import java.util.*;

public class DuplicateElements {
    public static void main(String[] args)
    {
        System.out.println("Enter your String");
        Scanner scan=new Scanner(System.in);
        String inputString=scan.nextLine();
        System.out.println(duplicateElementPrint(inputString));
    }

    public static String duplicateElementPrint(String inputString)
    {
        StringBuffer outputString=new StringBuffer("");
        ArrayList<Integer> ouputList=new ArrayList<>();
        String[] splitStringArray=inputString.split(",");
        HashMap<String,Integer> stringHashMap=new HashMap();

        for(int i=0;i<splitStringArray.length;i++)
        {
            if(stringHashMap.containsKey(splitStringArray[i]))
            {
                if(stringHashMap.get(splitStringArray[i])==1) {
                    //outputString.append(splitStringArray[i] + ",");
                    ouputList.add((Integer.parseInt(splitStringArray[i].replaceAll("\\s",""))));
                    stringHashMap.put(splitStringArray[i],stringHashMap.get(splitStringArray[i])+1);
                }
                else{
                    stringHashMap.put(splitStringArray[i],stringHashMap.get(splitStringArray[i])+1);
                }
            }
            else{
                stringHashMap.put(splitStringArray[i],1);
            }
        }
        Collections.sort(ouputList);
        for(int i=0;i<ouputList.size();i++)
        {
            outputString.append(ouputList.get(i)+",");
        }
        return outputString.toString();
    }
}
