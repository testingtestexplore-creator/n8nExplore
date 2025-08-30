package Java;

import java.util.HashMap;

public class lengthOfLongestSubStringWithoutRepeatingCharacters {
    
public static void main(String[] args) {

    String str = "abcdbcdab";
    int mn= findLegthOfLongestSubString(str);
    System.out.println("Length of Longest SubString : "+mn);
    
}

public static int findLegthOfLongestSubString(String str)
{
int start=0;
int maxLength=0;
HashMap<Character,Integer> map=new HashMap<Character,Integer>();

for(int end=0;end<str.length();end++)
{
    char ch=str.charAt(end);
    if(map.containsKey(ch))
    {
        start=Math.max(start, map.get(ch)+1);
    }
    map.put(ch, end);
    maxLength = Math.max(maxLength, (end-start)+1);

}

return maxLength;


}


}
